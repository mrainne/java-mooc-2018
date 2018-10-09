
import fi.helsinki.cs.tmc.edutestutils.MockStdio;
import fi.helsinki.cs.tmc.edutestutils.Points;
import fi.helsinki.cs.tmc.edutestutils.ReflectionUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.*;
import static org.junit.Assert.*;

@Points("03-16")
public class ListallaOlevienArvojenMaaraTest {

    @Rule
    public MockStdio io = new MockStdio();

    @Test
    public void testi() {
        String[][] syotteet = {{"Terho", "Elina", "Aleksi", "Mari", ""}, {"Elina", "Aleksi", "Mari", ""}, {"Eka", "Toka", "Kolmas", "Neljäs", "Viides", "Kuudes", "Seitsemäs", ""}};

        for (int i = 0; i < syotteet.length; i++) {
            tarkista(syotteet[i]);
        }
    }

    @Test
    public void testiEiKokonaislukuja() throws FileNotFoundException {
        Scanner s = new Scanner(new File("src", "ListallaOlevienArvojenMaara.java"));
        while (s.hasNextLine()) {
            String line = s.nextLine();

            if (line.contains("int ")) {
                fail("Älä käytä int-tyyppistä muuttujaa ohjelmassa.");
            }
        }

        s.close();

    }

    private void tarkista(String... merkkijonot) {
        int oldOut = io.getSysOut().length();

        String in = "";
        for (int i = 0; i < merkkijonot.length; i++) {
            in += merkkijonot[i] + "\n";
        }

        io.setSysIn(in);
        callMain(ListallaOlevienArvojenMaara.class);
        String out = io.getSysOut().substring(oldOut);

        assertTrue("et tulosta mitään!", out.length() > 0);

        int vastaus = otaLukuLopusta(out);
        int odotettuVastaus = merkkijonot.length - 1;

        String virheIlm = "Syöte:\n" + in + "\n\n Odotettiin: \"" + odotettuVastaus + "\", tulostit: \"" + vastaus + "\"\n";
        assertEquals(virheIlm, odotettuVastaus, vastaus);
    }

    private void callMain(Class kl) {
        try {
            kl = ReflectionUtils.newInstanceOfClass(kl);
            String[] t = null;
            String x[] = new String[0];
            Method m = ReflectionUtils.requireMethod(kl, "main", x.getClass());
            ReflectionUtils.invokeMethod(Void.TYPE, m, null, (Object) x);
        } catch (NoSuchElementException e) {
            fail("Ohjelmasi koitti lukea liikaa syötettä. Muista lukea nextLine()-metodilla!");
        } catch (Throwable e) {
            fail(kl + "-luokan public static void main(String[] args) -metodi on hävinnyt "
                    + "tai jotain muuta odottamatonta tapahtunut, lisätietoja " + e);
        }
    }

    private static int otaLukuLopusta(String inputStr) {

        String patternStr = "(?s).*?(\\d+)\\s*$";

        Matcher matcher = Pattern.compile(patternStr).matcher(inputStr);

        assertTrue("Tulostuksen pitäisi olla muotoa \"Yhteensä: 10\". Nyt tulostit: " + inputStr, matcher.find());

        int luku = Integer.parseInt(matcher.group(1));
        return luku;
    }
}

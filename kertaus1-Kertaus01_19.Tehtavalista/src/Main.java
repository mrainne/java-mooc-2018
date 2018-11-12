
public class Main {

    public static void main(String[] args) {
        // Kirjoita ohjelmasi tähän alle
        Tehtava t = new Tehtava("Korjaa kokeet");
        System.out.println(t);
        t.asetaTehdyksi();
        System.out.println(t);
        t.asetaTekemattomaksi();
        System.out.println(t);

        Tehtavalista tl = new Tehtavalista();
        tl.lisaa("Käy kaupassa");
        System.out.println(tl);
        tl.asetaTehdyksi("Käy kaupassa");
        System.out.println(tl);
        Tehtava t2 = tl.annaTehtava("Käy kaupassa");
        t2.asetaTekemattomaksi();
        tl.lisaa("Imuroi");
        System.out.println(tl);
    }

}

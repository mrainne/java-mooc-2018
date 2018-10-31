
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Reseptihaku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Resepti> reseptit = new ArrayList<>();
        System.out.print("Mistä luetaan? ");
        try {
            Scanner tiedostolukija = new Scanner(new File(lukija.nextLine()));
            while (tiedostolukija.hasNextLine()) {
                String nimi = tiedostolukija.nextLine();
                int aika = Integer.parseInt(tiedostolukija.nextLine());
                Resepti resepti = new Resepti(nimi, aika);
                reseptit.add(resepti);
                while (tiedostolukija.hasNextLine()) {
                    String ainesosa = tiedostolukija.nextLine();
                    if (ainesosa.isEmpty()) {
                        break;
                    }
                    resepti.lisaaRaakaAine(ainesosa);
                }
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        
        System.out.println("Komennot:");
        System.out.println("listaa  – listaa reseptit");
        System.out.println("lopeta – lopettaa ohjelman");
        System.out.println("hae nimi – hakee reseptiä nimen perusteella");
        System.out.println("hae keittoaika – hakee reseptiä keittoajan perusteella");
        System.out.println("hae aine – hakee resptiä raaka-aineen perusteella");
        System.out.println("");
        
        while (true) {
            System.out.print("Syötä komento: ");
            String komento = lukija.nextLine();
            
            if (komento.equals("lopeta")) {
                break;
            }
            
            if (komento.equals("listaa")) {
                System.out.println("Reseptit:");
                for (Resepti resepti: reseptit) {
                    resepti.tulostaResepti();
                }
            }
            
            if (komento.equals("hae nimi")) {
                System.out.print("Mitä haetaan: ");
                String haettava = lukija.nextLine();
                System.out.println("Reseptit:");
                for (Resepti resepti: reseptit) {
                    if (resepti.getNimi().indexOf(haettava) != -1) {
                        resepti.tulostaResepti();
                    }
                }
            }
            
            if (komento.equals("hae keittoaika")) {
                System.out.print("Keittoaika korkeintaan: ");
                int aika = Integer.parseInt(lukija.nextLine());
                System.out.println("Reseptit:");
                for (Resepti resepti: reseptit) {
                    if (resepti.getKeittoaika() <= aika) {
                        resepti.tulostaResepti();
                    }
                }
            }
            
            if (komento.equals("hae aine")) {
                System.out.print("Mitä raaka-ainetta haetaan: ");
                String haettava = lukija.nextLine();
                System.out.println("Reseptit:");
                for (Resepti resepti: reseptit) {
                    ArrayList<String> aineet = resepti.getRaakaAineet();
                    if (aineet.contains(haettava)) {
                            resepti.tulostaResepti();
                    }
                }
            }
            System.out.println("");
        }
    }

}

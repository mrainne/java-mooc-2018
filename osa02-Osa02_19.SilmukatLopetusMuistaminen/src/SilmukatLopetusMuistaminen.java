
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        Scanner lukija = new Scanner(System.in);
        int luku = 0;
        int summa = 0;
        int lukuja = 0;
        int parillisia = 0;
        
        System.out.println("Syötä luvut: ");
        while (true) {
            luku = Integer.parseInt(lukija.nextLine());
            if (luku == -1) {
                break;
            }
            summa += luku;
            lukuja++;
            
            if (luku % 2 == 0) {
                parillisia++;
            } 
        }
        System.out.println("Kiitos ja näkemiin!");
        System.out.println("Summa: " + summa);
        System.out.println("Lukuja: " + lukuja);
        double keskiarvo = 1.0 * summa / lukuja;
        System.out.println("Keskiarvo: " + keskiarvo);
        System.out.println("Parillisia: " + parillisia);
        int parittomia = lukuja - parillisia;
        System.out.println("Parittomia: " + parittomia);
    }
}

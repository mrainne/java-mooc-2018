
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta tänne toiminnallisuus, jonka avulla käyttäjä voi syöttää
        // kirjoja sekä tarkastella niitä
        Scanner lukija = new Scanner(System.in);
        ArrayList<Kirja> kirjat = new ArrayList<>();
        
        while (true) {
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }
            System.out.print("Sivuja: ");
            int sivuja = Integer.parseInt(lukija.nextLine());
            System.out.print("Kirjoitusvuosi: ");
            int vuosi = Integer.parseInt(lukija.nextLine());
            
            kirjat.add(new Kirja(nimi, sivuja, vuosi));
        }
        System.out.println("");
        System.out.print("Mitä tulostetaan? ");
        String komento = lukija.nextLine();
        
        for (Kirja kirja:kirjat) {
            if (komento.equals("kaikki")) {
                System.out.println(kirja);
            }
            
            if (komento.equals("nimi")) {
                System.out.println(kirja.getNimi());
            }
        }
        
    }
}

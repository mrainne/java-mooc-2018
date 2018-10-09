
import java.util.Scanner;

public class KolmenLuvunSummaaja {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. Muista kysyä kolmea lukua käyttäjältä!
        System.out.print("Anna ensimmäinen luku: ");
        int summa = Integer.parseInt(lukija.nextLine());
        System.out.print("Anna toinen luku: ");
        summa = summa + Integer.parseInt(lukija.nextLine());
        System.out.print("Anna kolmas luku: ");
        summa = summa + Integer.parseInt(lukija.nextLine());
        System.out.println("");
        System.out.println("Lukujen summa: " + summa);        
    }
}

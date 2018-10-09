
import java.util.Scanner;

public class Jakaja {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. Muista kysyä luvut käyttäjältä!
        System.out.print("Anna ensimmäinen luku: ");
        int ekaLuku = Integer.parseInt(lukija.nextLine());
        System.out.print("Anna toinen luku: ");
        int tokaLuku = Integer.parseInt(lukija.nextLine());
        
        double tulos = 1.0 * ekaLuku / tokaLuku;
        System.out.println("");
        System.out.println("Jakolasku: " + ekaLuku + " / " + tokaLuku + " = " + tulos);
    }
}

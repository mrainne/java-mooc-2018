
import java.util.Scanner;

public class SuurempiTaiYhtasuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna ensimmäinen luku: ");
        int ekaLuku = Integer.parseInt(lukija.nextLine());
        System.out.print("Anna toinen luku: ");
        int tokaLuku = Integer.parseInt(lukija.nextLine());
        
        if (ekaLuku > tokaLuku) {
            System.out.println("Suurempi luku: " + ekaLuku);
        } else if (tokaLuku > ekaLuku) {
            System.out.println("Suurempi luku: " + tokaLuku);
        } else {
            System.out.println("Luvut ovat yhtä suuret!");
        }

    }
}

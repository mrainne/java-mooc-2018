
import java.util.Random;
import java.util.Scanner;

public class Numerovisa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int arvottuLuku = arvoLuku();
        int arvauksia = 1;

        // ÄLÄ MUOKKAA YLLÄOLEVIA ASIOITA -- OHJELMOI OHJELMASI ALLE
        while (true) {
            System.out.print("Arvaa luku: ");
            int arvaus = Integer.parseInt(lukija.nextLine());
            if (arvaus == arvottuLuku) {
                break;
            }
            
            if (arvaus < arvottuLuku) {
                System.out.println("Luku on suurempi, tehtyjä arvauksia " + arvauksia);
            } else {
                System.out.println("Luku on pienempi, tehtyjä arvauksia " + arvauksia);
            }
            arvauksia++;
        }
        System.out.println("Onneksi olkoo, oikein arvattu!");
    }

    // ÄLÄ MUOKKAA METODIA arvoLuku
    private static int arvoLuku() {
        return new Random().nextInt(101);
    }
}

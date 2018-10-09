
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        // lasketaan summa k, k + 1, ..., n-1, n
        Scanner lukija = new Scanner(System.in);
        System.out.print("Ensimmäinen: ");
        int luku = Integer.parseInt(lukija.nextLine());
        System.out.print("Viimeinen: ");
        int vika = Integer.parseInt(lukija.nextLine());
        
        int summa = 0;
        
        while (luku <= vika) {
            summa += luku;
            luku++;
        }
        System.out.println("Summa on: " + summa);
    }
}

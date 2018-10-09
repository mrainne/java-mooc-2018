
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        // lasketaan lukujen 1, 2,..., n summa
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        System.out.print("Mihin asti? ");
        
        int ylaRaja = Integer.parseInt(lukija.nextLine());
        int luku = 1;
        while (luku <= ylaRaja) {
            summa += luku;
            luku++;
        }
        System.out.println("Summa on: " + summa);
    }
}

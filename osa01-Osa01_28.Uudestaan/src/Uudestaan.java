
import java.util.Scanner;

public class Uudestaan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Syötä luku: ");
        int luku = Integer.parseInt(lukija.nextLine());
        
        while (luku != 4) {
            System.out.print("Syötä luku: ");
            luku = Integer.parseInt(lukija.nextLine());
        }

    }
}

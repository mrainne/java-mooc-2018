import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Kirjoita ohjelmasi tähän alle
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Luku: ");
        int luku = Integer.parseInt(lukija.nextLine());
        System.out.println("");
        
        for (int i = 1; i <= 10; i++) {
            int tulo = i * luku;
            System.out.println("1 * " + luku + " = " + tulo);
        }

    }

}

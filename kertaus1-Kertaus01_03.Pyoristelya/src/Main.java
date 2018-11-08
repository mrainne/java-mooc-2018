import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Kirjoita ohjelmasi tähän alle
        Scanner lukija = new Scanner(System.in);
        System.out.print("Luku: ");
        int luku = Integer.parseInt(lukija.nextLine());
        
        System.out.println("Pyöristys: " + pyoristaYlospainViidellaJaolliseen(luku));
    }

    public static int pyoristaYlospainViidellaJaolliseen(int luku) {
        if (luku % 5 == 0) {
            return luku;
        }
        
        return luku + (5 - luku % 5);
    }
}

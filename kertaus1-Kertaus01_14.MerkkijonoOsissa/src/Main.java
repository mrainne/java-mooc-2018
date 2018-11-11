import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Kirjoita ohjelmasi tähän alle
        Scanner lukija = new Scanner(System.in);
        System.out.print("Merkkijono: ");
        String merkkijono = lukija.nextLine();
        
        for (int i = merkkijono.length() - 1; i >= 0; i--) {
            System.out.println(merkkijono.charAt(i));
        }
    }

}

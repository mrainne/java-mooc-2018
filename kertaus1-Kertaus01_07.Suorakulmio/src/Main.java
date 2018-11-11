import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Kirjoita ohjelmasi tähän alle
        Scanner lukija = new Scanner(System.in);
        System.out.print("Leveys: ");
        int leveys = Integer.parseInt(lukija.nextLine());
        System.out.print("Korkeus: ");
        int korkeus = Integer.parseInt(lukija.nextLine());
        
        
        for (int i = 1; i <= korkeus; i++) {
            String xRivi = "";
            for (int j=1; j <= leveys; j++) {
                xRivi += String.join("", "x");
            }
            System.out.println(xRivi);
        }
    }

}

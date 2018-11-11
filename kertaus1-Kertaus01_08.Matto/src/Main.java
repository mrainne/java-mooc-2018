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
            if (i % 2 != 0) {
                tulostaPariton(leveys);
            } else {
                tulostaParillinen(leveys);
            }
        }
    }
    public static void tulostaPariton(int leveys) {
        // tulostetaan leveys * x
        String xRivi = "";
        for (int i = 1; i <= leveys; i++) {
            xRivi += String.join("", "x");
        }
        System.out.println(xRivi);
    }
    
    public static void tulostaParillinen(int leveys) {
        String xoRivi = "";
        for (int i = 1; i <= leveys; i++) {
            if (i % 2 != 0) {
                xoRivi += String.join("", "x");
            } else {
                xoRivi += String.join("", "o");
            }
        }
        System.out.println(xoRivi);
    }
    
}

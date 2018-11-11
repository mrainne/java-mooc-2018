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
            String rivi = "";
            for (int j = 1; j <= leveys; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    rivi += "o";
                } else if (i % 3 == 0 && j % 3 == 0) {
                    rivi += "z";
                } else if (i % 5 == 0 && j % 5 == 0) {
                    rivi += "s";
                } else {
                    rivi += "x";
                }
            }
            System.out.println(rivi);
        }
    }

}

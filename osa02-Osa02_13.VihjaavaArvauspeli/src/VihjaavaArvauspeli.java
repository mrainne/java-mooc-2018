
import java.util.Scanner;

public class VihjaavaArvauspeli {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // kun olet palauttanut tehtävän ja saanut siitä pisteet,
        // kokeile myös seuraavaa: 
        // int arvattava = (int) (1 + Math.random() * 100);

        int arvattava = 42;
        int arvauksia = 1;

        System.out.println("Minäpä tiedän luvun väliltä 1-100, jota sinä et tiedä!");
        while (true) {
            System.out.print("Arvaa luku:");
            
            int luku = Integer.parseInt(lukija.nextLine());
            
            if (luku == arvattava) {
                break;
            }
            
            if (luku < 1 || luku > 100) {
                System.out.println("Epäkelpo luku!");
                continue;
            }
            
            if (luku < arvattava) {
                System.out.println("Lukuni on isompi!");
            } else if (luku > arvattava) {
                System.out.println("Lukuni on pienempi!");
            }
            
            arvauksia++;
        }
        System.out.println("");
        System.out.println("Oikein! Arvauksia yhteensä: " + arvauksia);
    }
}

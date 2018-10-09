
import java.util.Scanner;

public class Arvauspeli {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int arvattava = 7;
        int arvauksia = 1;

        System.out.println("Minäpä tiedän luvun väliltä 1-10, jota sinä et tiedä!");
        
        while (true) {
            System.out.print("Arvaa luku:");
            int luku = Integer.parseInt(lukija.nextLine());
            
            if (luku == arvattava) {
                break;
            }
            
            if (luku < 1 || luku > 10) {
                System.out.println("Epäkelpo luku!");
                continue;
            }
            System.out.println("Ei ollut!");
            arvauksia++;
        }
        System.out.println("");
        System.out.println("Oikein! Arvauksia yhteensä: " +arvauksia);
    }
}

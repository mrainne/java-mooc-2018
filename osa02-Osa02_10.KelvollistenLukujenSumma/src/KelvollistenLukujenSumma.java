
import java.util.Scanner;

public class KelvollistenLukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        
        while (true) {
            System.out.print("Syötä luku:");
            int luku = Integer.parseInt(lukija.nextLine());
            
            if (luku == 9999) {
                break;
            }
            
            if (luku < -140 || luku > 20) {
                System.out.println("Epäkelpo luku");
                continue;
            }
            
            summa += luku;
        }
        System.out.println("");
        System.out.println("Kelvollisten lukujen summa: " + summa);

    }
}

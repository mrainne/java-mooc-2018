
import java.util.Scanner;
import java.util.ArrayList;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Tee sovelluksesi tänne -- kannattaa harkita sovelluksen pilkkomista
        // useampaan luokkaan.
        ArvosanaJakauma pisteet = new ArvosanaJakauma();
        
        System.out.println("Syötä yhteispisteet, -1 lopettaa:");
        while (true) {
            int pistemaara = Integer.parseInt(lukija.nextLine());
            
            if (pistemaara == -1) {
                break;
            }
            pisteet.lisaaPisteet(pistemaara);
        }
        pisteet.tulosta();
    }
    
    
}

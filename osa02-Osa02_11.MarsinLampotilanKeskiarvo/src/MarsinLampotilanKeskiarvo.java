
import java.util.Scanner;

public class MarsinLampotilanKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int kelvollisiaLukuja = 0;
        int kelvollistenLukujenSumma = 0;
        
        while (true) {
            System.out.print("Syötä mittaus:");
            int mittaus = Integer.parseInt(lukija.nextLine());
            
            if (mittaus == 9999) {
                break;
            }
            
            if (mittaus < -140 || mittaus > 20){
                continue;
            }
            kelvollisiaLukuja++;
            kelvollistenLukujenSumma += mittaus;
        }
        double keskiarvo = 1.0 * kelvollistenLukujenSumma/kelvollisiaLukuja;
        System.out.println("");
        System.out.println("Mittausten keskiarvo on:" + keskiarvo);
    }
}

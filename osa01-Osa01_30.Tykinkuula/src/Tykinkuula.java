
import java.util.Scanner;

public class Tykinkuula {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        double suurinKorkeus = 0;
        int sekunteja = 0;
        double korkeus = 0;
        
        System.out.println("Syötä tykinkuulan lähtönopeus: ");
        double nopeus = Double.parseDouble(lukija.nextLine());
        
        System.out.println("Syötä painovoima: ");
        double painovoima = Double.parseDouble(lukija.nextLine());
        
        while (true) {
            if (korkeus < 0) {
                break;
            }
            System.out.println(sekunteja + "\t" + korkeus + "\t" + nopeus);
            
            korkeus = korkeus + nopeus;
            sekunteja = sekunteja + 1;
            nopeus = nopeus - painovoima;
            
            if (korkeus > suurinKorkeus) {
                suurinKorkeus = korkeus;
            }
        }
        
        System.out.println("");
        System.out.println("Tykinkuulan suurin korkeus oli " + suurinKorkeus);
    }
}

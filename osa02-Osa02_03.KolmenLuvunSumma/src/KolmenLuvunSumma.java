
import java.util.Scanner;

public class KolmenLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        
        for (int i = 1; i <= 3; i++) {
            System.out.print("Anna luku: ");
            summa += Integer.parseInt(lukija.nextLine());
        }
        // KIRJOITA OHJELMA TÄHÄN
        // ÄLÄ KÄYTÄ MUITA MUUTTUJIA KUIN lukija ja summa !
        System.out.println("Summa: " + summa);
    }
}

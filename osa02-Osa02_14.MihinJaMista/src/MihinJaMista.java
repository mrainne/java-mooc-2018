
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Mihin asti? ");
        int ylaRaja = Integer.parseInt(lukija.nextLine());
        
        System.out.print("Mistä lähtien? ");
        int luku = Integer.parseInt(lukija.nextLine());
        while (luku <= ylaRaja) {
            System.out.println(luku);
            luku++;
        }
    }
}


import java.util.Scanner;

public class YmpyranKehanPituus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän.
        System.out.print("Anna ympyrän säde: ");
        double sade = Double.parseDouble(lukija.nextLine());
        double ympyranKeha = 2 * Math.PI * sade;
        System.out.println("");
        System.out.println("Ympyrän kehä: " + ympyranKeha);
    }
}

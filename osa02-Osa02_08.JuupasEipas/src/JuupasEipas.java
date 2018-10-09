
import java.util.Scanner;

public class JuupasEipas {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // kirjoita ohjelma tänne
        while (true) {
            System.out.print("Anna luku, 0 lopettaa:");
            int luku = Integer.parseInt(lukija.nextLine());
            
            if (luku == 0) {
                break;
            }
            
            if (luku < 0) {
                System.out.println("Eipäs");
            } else if (luku > 0) {
                System.out.println("Juupas");
            } 
        }
    }
}

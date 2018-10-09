
import java.util.Scanner;

public class ReilutPitsabileet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Montako osallistujaa? ");
        int osallistuja = Integer.parseInt(lukija.nextLine());
        System.out.print("Montako pitsaa? ");
        int pitsa = Integer.parseInt(lukija.nextLine());
        System.out.print("Montako palaa per pitsa? ");
        int palaaPerPitsa = Integer.parseInt(lukija.nextLine());
        
        int paloja = pitsa * palaaPerPitsa;
        int yli = paloja % osallistuja;
        
        System.out.println("");
        System.out.println("Paloja jää yli: " + yli);
        
    }
}


import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna pistet [0-100]:");
        int pisteet = Integer.parseInt(lukija.nextLine());
        String arvosana = "";
        
        if (pisteet < 0) {
            arvosana = "mahdotonta!";
        } else if (pisteet < 70) {
            arvosana = "hylätty";
        } else if (pisteet < 76) {
            arvosana = "1";
        } else if (pisteet < 81) {
            arvosana = "2";
        } else if (pisteet < 86) {
            arvosana = "3";
        } else if (pisteet < 91) {
            arvosana = "4";
        } else if (pisteet <= 100) {
            arvosana = "5";
        } else {
            arvosana = "uskomatonta!";
        }
        System.out.println("Arvosana: " + arvosana);
    }
}

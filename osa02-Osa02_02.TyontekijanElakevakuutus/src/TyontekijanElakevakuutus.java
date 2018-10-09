
import java.util.Scanner;

public class TyontekijanElakevakuutus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Syötä bruttopalkka: ");
        int bruttopalkka = Integer.parseInt(lukija.nextLine());
        
        // työnantajan maksu
        int antaja = (int) (0.18 * bruttopalkka);
        // työnantajan kustannus yht.
        int kustannus = bruttopalkka + antaja;
        
        // työntekijän maksu
        int tekija = (int)(0.06 * bruttopalkka);
        // työntekijän palkka maksun jälkeen
        int nettopalkka = bruttopalkka - tekija;
        
        // eläkekulut yhteensä
        int kulutYht = antaja + tekija;
        
        System.out.println("Työnantaja maksaa TyEL-maksuja: " + antaja);
        System.out.println("Työntekijän kustannus työnantajalle vähintään: " + kustannus);  
        System.out.println("");
        System.out.println("Työntekijä maksaa TyEL-maksuja: " + tekija);
        System.out.println("Työntekijän palkka TyEL-maksun jälkeen: " + nettopalkka);
        System.out.println("");
        System.out.println("TyEL-kulut yhteensä: " + kulutYht);
    }
}

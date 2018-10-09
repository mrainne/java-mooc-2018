
import java.util.ArrayList;
import java.util.Scanner;

public class Varasto {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        
        System.out.println("Varastonhallinta.");
        System.out.println("");
        
        while (true) {
            System.out.println("Syötä komento: (lisaa, poista, hae, lopeta)");
            String komento = lukija.nextLine();
            
            if (komento.equals("lopeta")) {
                break;
            }
            
            System.out.println("Syötä esine:");
            String esine = lukija.nextLine();
            
            if (komento.equals("lisaa")) {
                lista.add(esine);
            } else if (komento.equals("poista")) {
                lista.remove(esine);
            } else if (komento.equals("hae")) {
                if (lista.contains(esine)) {
                    System.out.println("Esine " + esine + " löytyy varastosta.");
                } else {
                    System.out.println("Esinettä " + esine + " ei löydy varastosta");
                }
            }
            
            
        }
    }
}

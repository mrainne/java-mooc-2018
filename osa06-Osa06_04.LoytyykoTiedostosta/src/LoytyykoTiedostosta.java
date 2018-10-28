
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();
        ArrayList<String> lista = new ArrayList<>();
        
        try {
            Scanner tiedostolukija = new Scanner(new File(tiedosto));
            while (tiedostolukija.hasNextLine()) {
                lista.add(tiedostolukija.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Tiedoston " + tiedosto + " lukeminen epäonnistui.");
        }

        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();
        if (lista.contains(etsittava)) {
            System.out.println("Löytyi!");
        } else {
            System.out.println("Ei löytynyt.");
        }

    }
}

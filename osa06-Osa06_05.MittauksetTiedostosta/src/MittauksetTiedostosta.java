
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();
        System.out.print("Alaraja? ");
        int alaraja = Integer.parseInt(lukija.nextLine());
        System.out.print("Yläraja? ");
        int ylaraja = Integer.parseInt(lukija.nextLine());
        
        int valilla = 0;
        
        try {
            Scanner tiedostolukija = new Scanner(new File(tiedosto));
            while (tiedostolukija.hasNextLine()) {
                int luku = Integer.parseInt(tiedostolukija.nextLine());
                if (luku >= alaraja && luku <= ylaraja) {
                    valilla++;
                }
            }
            System.out.println("Lukuja: " + valilla);
        } catch (Exception e) {
            System.out.println("Virhe " + e.getMessage());
        }
        
    }

}

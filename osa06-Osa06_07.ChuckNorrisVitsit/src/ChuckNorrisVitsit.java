
import java.util.Scanner;
import java.net.URL;

public class ChuckNorrisVitsit {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String url = "http://api.icndb.com/jokes/";
        // Toteuta vitsien lukeminen tässä
        System.out.println("Komennot:");
        System.out.println("lopeta – lopettaa ohjelman");
        System.out.println("satunnainen – satunnainen vitsi");
        System.out.println("vitsi <numero> – vitsi numero <numero>");
        System.out.println("");
        
        while (true) {
            System.out.print("Anna komento: ");
            String komento = lukija.nextLine();
            
            if (komento.equals("lopeta")) {
                break;
            }
            
            if (komento.equals("satunnainen")) {
                url += "random";
            }
            
            if (komento.startsWith("vitsi")) {
                String numero = komento.split(" ")[1];
                url += numero;
            }
            
            try {
                Scanner vitsilukija = new Scanner(new URL(url).openStream());
                while (vitsilukija.hasNextLine()) {
                    System.out.println(vitsilukija.nextLine());
                }
            } catch (Exception e) {
                System.out.println("Virhe: " + e.getMessage());
            }
        }
    }
}

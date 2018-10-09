
import java.util.ArrayList;
import java.util.Scanner;

public class Ajatustenlukija {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> heitot = new ArrayList<>();
        int voitot = 0;

        while (true) {
            // peli päättyy kun jommalla kummalla on yli 25 pistettä
            if (voitot >= 25 || heitot.size() - voitot >= 25) {
                break;
            }

            // arvaustoiminnallisuus saa käyttöönsä aiemmat syötteet
            String arvaus = arvaa(heitot);

            System.out.print("Syötä h tai t: ");
            String heitto = lukija.nextLine();
            if (!(heitto.equals("h") || heitto.equals("t"))) {
                System.out.println("höpönlöpön..");
                continue;
            }

            if (heitto.equals(arvaus)) {
                voitot++;
            }

            heitot.add(heitto);
        
            System.out.println("Syötit " + heitto + ", arvasin " + arvaus + ".");
            System.out.println("Tietokoneen voitot: " + voitot);
            System.out.println("Pelaajan voitot: " + (heitot.size() - voitot));

            System.out.println();
        }

        System.out.println("Peli päättyi.");
    }
    
    public static String arvaa(ArrayList<String> heitot) {
        if (heitot.size() < 3) {
            return "h";
        }

        String viimeinen = heitot.get(heitot.size() - 1);
        String toiseksiViimeinen = heitot.get(heitot.size() - 2);

        int indeksi = 2;
        int heads = 0;
        int tails = 0;

        while (indeksi < heitot.size()) {
            if (heitot.get(indeksi - 2).equals(toiseksiViimeinen) && heitot.get(indeksi - 1).equals(viimeinen)) {
                System.out.println("hep");

                if (heitot.get(indeksi).equals("h")) {
                    heads++;
                } else {
                    tails++;
                }

            }

            indeksi++;
        }

        if (heads > tails) {
            return "h";
        }

        return "t";
    }

}
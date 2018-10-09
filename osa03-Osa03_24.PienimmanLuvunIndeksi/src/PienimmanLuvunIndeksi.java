
import java.util.ArrayList;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // toteuta tänne ohjelma, joka lukee käyttäjältä lukuja
        // kunnes käyttäjä syöttää luvun 9999
        
        // tämän jälkeen ohjelma tulostaa pienimmän luvun
        // sekä sen indeksin -- pienin luku voi esiintyä
        // useammassa indeksissä
        ArrayList<Integer> lista = new ArrayList<>();
        
        while (true) {
            int luku = Integer.parseInt(lukija.nextLine());
            
            if (luku == 9999) {
                break;
            }
            
            lista.add(luku);
        }
        
        System.out.println("");
        int pienin = lista.get(0);
        
        for (Integer luku: lista) {
            if (luku < pienin) {
                pienin = luku;
            }
        }
        System.out.println("Pienin luku on " + pienin);
        
        int indeksi = 0;
        
        while (indeksi < lista.size()) {
            if (lista.get(indeksi) == pienin) {
                System.out.println("Pienin luku löytyy indeksistä " + indeksi);
            }
            indeksi++;
        }
    }
}

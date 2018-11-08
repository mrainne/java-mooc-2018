import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Kirjoita ohjelmasi tähän alle
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> luvut = new ArrayList<>();
        
        while (true) {
            System.out.print("Luku: ");
            String tyhja = lukija.nextLine();
            
            if (tyhja.isEmpty()) {
                break;
            }
      
            int luku = Integer.parseInt(tyhja);
            luvut.add(luku);
            
        }
        int kolmellaJaollistenSumma = kolmellaJaollistenSumma(luvut);
        
        if (kolmellaJaollistenSumma==0) {
            System.out.println("Ei kolmella jaollisia lukuja");
        } else {
            System.out.println("Kolmella jaollisten lukujen summa: " + kolmellaJaollistenSumma);
        }
    }
    
    private static int kolmellaJaollistenSumma(ArrayList<Integer> luvut) {
        int summa = 0;
        for (Integer luku: luvut) {
            if (luku % 3 == 0) {
                summa += luku;
            }
        }
        return summa;
    }

}

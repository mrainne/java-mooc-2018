import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Kirjoita ohjelmasi tähän alle
        ArrayList<Integer> luvut = new ArrayList<>();
        luvut.add(1);
        luvut.add(4);
        luvut.add(5);
        luvut.add(2);
        luvut.add(3);
        luvut.add(6);
        
        System.out.println("Löytyykö luvut väliltä 4-8 (ei): " + loytyykoLuvutValilta(luvut, 4, 8));
        System.out.println("Löytyykö luvut väliltä 2-5 (kyllä) " + loytyykoLuvutValilta(luvut, 2, 5));
    }

    public static boolean loytyykoLuvutValilta(ArrayList<Integer> luvut, int alku, int loppu) {
        ArrayList<Integer> luvutAlustaLoppuun = new ArrayList<>();
        for (int i = alku; i <= loppu; i++) {
            luvutAlustaLoppuun.add(i);
        }
        
        return luvut.containsAll(luvutAlustaLoppuun);
    }
}

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Kirjoita ohjelmasi tähän alle
        ArrayList<Integer> lukuja = new ArrayList<>();
        lukuja.add(2);
        lukuja.add(3);
        lukuja.add(2);
        
        System.out.println("Esiintyykö luku 1 listassa kerran (ei)? " + esiintyykoListallaKerran(lukuja, 1));
        System.out.println("Esiintyykö luku 2 listassa kerran (ei)? " + esiintyykoListallaKerran(lukuja, 2));
        System.out.println("Esiintyykö luku 3 listassa kerran (jep)? " + esiintyykoListallaKerran(lukuja, 3));
    }

    public static boolean esiintyykoListallaKerran(ArrayList<Integer> luvut, int luku) {
        int esiintyy = 0;
        for (Integer listanLuku: luvut) {
            if (listanLuku == luku) {
                esiintyy++;
            }
        }
        return (esiintyy == 1);
    }
}

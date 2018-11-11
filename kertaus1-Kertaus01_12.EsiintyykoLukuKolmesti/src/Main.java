import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Kirjoita ohjelmasi tähän alle
        ArrayList<Integer> luvut = new ArrayList<>();
        luvut.add(1);
        luvut.add(5);
        luvut.add(4);
        luvut.add(5);
        luvut.add(5);
        luvut.add(5);
        luvut.add(4);
        luvut.add(2);
        luvut.add(4);
        
        System.out.println("Esiintyykö luku 1 listalla kolme kertaa (ei): " + esiintyykoListallaKolmesti(luvut, 1));
        System.out.println("Esiintyykö luku 5 listalla kolme kertaa (ei): " + esiintyykoListallaKolmesti(luvut, 5));
        System.out.println("Esiintyykö luku 4 listalla kolme kertaa (kyllä) " + esiintyykoListallaKolmesti(luvut, 4));
    }
    
    public static boolean esiintyykoListallaKolmesti(ArrayList<Integer> luvut, int luku) {
        int esiintymia = 0;
        for (Integer listanLuku: luvut) {
            if (listanLuku == luku) {
                esiintymia++;
            }
        }
        return (esiintymia == 3);
    }

}

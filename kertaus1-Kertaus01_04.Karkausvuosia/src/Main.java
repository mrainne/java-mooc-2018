import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Kirjoita ohjelmasi tähän alle
        Scanner lukija = new Scanner(System.in);
        System.out.print("Syötä vuosiluku: ");
        int vuosi = Integer.parseInt(lukija.nextLine());
        
        System.out.print("Karkausvuodet: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(seuraavatKarkausvuodet(vuosi)[i] + ", ");
        }
        System.out.print(seuraavatKarkausvuodet(vuosi)[4]);
        System.out.println("");

    }
    
    public static int[] seuraavatKarkausvuodet(int vuosi) {
        int[] seuraavat = new int[5];
        int seuraavaNeljallaJaollinen = 0;
        
        if (vuosi % 4 == 0) {
            seuraavaNeljallaJaollinen = vuosi;
        } else {
            seuraavaNeljallaJaollinen = vuosi + (4 - vuosi % 4);
        }
        
        int i = 0;
        while (i < 5) {
            if (karkausvuosi(seuraavaNeljallaJaollinen)) {
                seuraavat[i] = seuraavaNeljallaJaollinen;
                i++;
            }
            seuraavaNeljallaJaollinen += 4;
        }
        
        return seuraavat;
        
    }
    
    public static boolean karkausvuosi(int vuosi) {
        
        if (vuosi % 400 == 0 || (vuosi % 4 == 0 && vuosi % 100 != 0)) {
            return true;
        }
        
        return false;
    }
}

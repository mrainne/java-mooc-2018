import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Kirjoita ohjelmasi tähän alle
        Scanner lukija = new Scanner(System.in);
        System.out.print("Nugetteja: ");
        int lkm = Integer.parseInt(lukija.nextLine());
        
        if (lkm % 4 == 0 || lkm % 6 == 0 || lkm % 9 == 0 || lkm % 20 == 0) {
            System.out.println("Ostaminen on mahdollista");
        } else {
            System.out.println("Ostaminen ei ole mahdollista");
        }
        
    }

}

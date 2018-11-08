import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Kirjoita ohjelmasi tähän alle
        Scanner lukija = new Scanner(System.in);
        System.out.print("Montako lukua tulostetaan: ");
        int tulostettavia = Integer.parseInt(lukija.nextLine());
        
        int fibo1 = 1;
        int fibo2 = 1;
        System.out.print(fibo1 + ", " + fibo2 + ", ");
        
        int i = 3;
        while (i < tulostettavia) {
            int seuraava = seuraavaFibonacci(fibo1, fibo2);
            System.out.print(seuraava + ", ");
            fibo1 = fibo2;
            fibo2 = seuraava;
            i++;     
        }
        System.out.print(seuraavaFibonacci(fibo1, fibo2));
        System.out.println("");
    }
    public static int seuraavaFibonacci(int viimeistaEdellinen, int edellinen) {
        return viimeistaEdellinen + edellinen;
    }
}

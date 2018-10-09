import java.util.Scanner;

public class Kertoma {
    public static void main(String[] args) {
        // lasketaan luvun n kertoma n! = n*(n-1)*...*2*1
        Scanner lukija = new Scanner(System.in);
        int kertoma = 1;
        
        System.out.print("Anna luku: ");
        int n = Integer.parseInt(lukija.nextLine());
                
        while (n >= 1) {
            kertoma *= n;
            n--;
        }
        System.out.println("Kertoma on " + kertoma);
    }
}

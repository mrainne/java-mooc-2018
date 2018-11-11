import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Kirjoita ohjelmasi tähän alle
        Scanner lukija = new Scanner(System.in);
        System.out.print("Syöte: ");
        String syote = lukija.nextLine();
        
        if (onkoPalindromi(syote)) {
            if (syote.length() % 2 == 0) {
                System.out.println("Ei jakajamerkkiä");
            } else {
                System.out.println("Palindromin jakajamerkki on " + syote.charAt(syote.length()/2));
            }
        } else {
            System.out.println("Ei palindromi");
        }
        

    }
    
    public static boolean onkoPalindromi(String syote) {
        //oletetaan että syöte on yksi sana ilman välejä tai välimerkkejä
        for (int i = 0; i <= syote.length() / 2; i++) {
            if (syote.charAt(i) != syote.charAt(syote.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

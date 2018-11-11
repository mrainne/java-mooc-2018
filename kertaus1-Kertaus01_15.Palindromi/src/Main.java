import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Kirjoita ohjelmasi tähän alle
        Scanner lukija = new Scanner(System.in);
        System.out.print("Syöte: ");
        String syote = lukija.nextLine().trim().toLowerCase(); 
        // ylimääräiset välit pois ja kaikki kirjaimet pieniksi
        
        if (onkoPalindromi(syote)) {
            System.out.println("Syöte on palindromi");
        } else {
            System.out.println("Syöte ei ole palindromi");
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

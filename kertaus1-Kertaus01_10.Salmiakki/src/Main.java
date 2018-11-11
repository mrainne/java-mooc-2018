import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Kirjoita ohjelmasi tähän alle
        Scanner lukija = new Scanner(System.in);
        System.out.print("Korkeus: ");
        int korkeus = Integer.parseInt(lukija.nextLine());
        
        // rivien numerointi [0, korkeus-1] 
        // miten löytyy oikea katkaisukohta, joka toimii sekä parillisille 
        // että parittomille korkeuksille?
        // (korkeus - 1) / 2 toimii, koska parittomalla korkeudella se on
        // pienempi kuin korkeus / 2
        for (int i = 0; i <= (korkeus-1)/2; i++) {
            // tähtien eteen tulostetaan tyhjää sopiva määrä
            // mikä on sopiva määrä? (korkeus + 1)/ 2 - i?
            System.out.print(tulostaTyhjaa((korkeus + 1)/ 2 - i));
            System.out.println(tahdestaTahteen(i, korkeus));
        }
        // kun päästään puoleen väliin, käännetään tulostus toisin päin
        for (int i = korkeus/2 - 1; i >= 0; i--) {
            System.out.print(tulostaTyhjaa((korkeus + 1) / 2 - i));
            System.out.println(tahdestaTahteen(i, korkeus));
        }
    }
    
    public static String tulostaTyhjaa(int maara) {
        String tyhjia = "";
        for (int i = 1; i <= maara; i++) {
            tyhjia += (" ");
        }
        return tyhjia;
    }
    
    public static String tahdestaTahteen(int riviNro, int korkeus) {
        String tahdet = "";
        // ensimmäisellä ja viimeisellä rivillä on vain yksi tähti.
        // rivien numerointi alkaa nollasta, ylimmällä ja alimmalla
        // rivillä riviNro = 0.
        if (riviNro == 0) {
            tahdet = "*";
        } else {
            // muilla riveillä on kaksi tähteä, joiden välissä on tyhjää.
            // jos rivien numerointi alkaa nollasta tulostetaan
            // tyhjiä 2 * riviNro - 1 
            tahdet = "*" + tulostaTyhjaa(2* riviNro - 1) + "*";
        }
        return tahdet;
    }

}

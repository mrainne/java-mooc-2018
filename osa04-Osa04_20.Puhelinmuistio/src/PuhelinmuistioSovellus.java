
import java.util.Scanner;

public class PuhelinmuistioSovellus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Puhelinmuistio muistio = new Puhelinmuistio();
        
        System.out.print("Minkä niminen tiedosto ladataan? ");
        String latausnimi = lukija.nextLine();
        muistio.lataa(latausnimi);
        System.out.println("");

        System.out.println("Puhelinmuistio");
        System.out.println("Komennot:");
        System.out.println("\tlopeta - lopettaa puhelinmuistion");
        System.out.println("\tlisaa - lisää uuden henkilön puhelinmuistioon");
        System.out.println("\tlistaa - listaa puhelinmuistion sisällön");
        System.out.println("\tetsi - etsii puhelinmuistiosta annettua numeroa");
        System.out.println("\tpoista - poistaa henkilön puhelinmuistiosta");
        
        // tee toteutuksesi tänne
        
        System.out.print("Minkä nimiseen tiedostoon muistio tallennetaan?");
        String tallennusnimi = lukija.nextLine();
        muistio.tallenna(tallennusnimi);
    }

}


public class Tulostelua {

    public static void tulostaTahtia(int maara) {
        // 22.1
        while (maara > 0){
            System.out.print("*");
            maara--;
        }
        System.out.println("");
    }

    public static void tulostaNelio(int sivunpituus) {
        // 22.2
        int riveja = sivunpituus;
        while (riveja > 0) {
            tulostaTahtia(sivunpituus);
            riveja--;
        }
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        // 22.3
        while (korkeus > 0) {
            tulostaTahtia(leveys);
            korkeus--;
        }
    }

    public static void tulostaKolmio(int koko) {
        // 22.4
        int luku = 1;
        while (luku <= koko) {
            tulostaTahtia(luku);
            luku++;
        }
    }

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        tulostaTahtia(3);
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(5, 6);
        System.out.println("\n---");
        tulostaKolmio(3);
        System.out.println("\n---");
    }

}

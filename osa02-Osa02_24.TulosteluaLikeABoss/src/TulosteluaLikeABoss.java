
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        // 02-24.1
        while (maara > 0) {
            System.out.print("*");
            maara--;
        }
        System.out.println("");
    }

    public static void tulostaTyhjaa(int maara) {
        // 02-24.1
        while (maara > 0) {
            System.out.print(" ");
            maara--;
        }
    }

    public static void tulostaKolmio(int koko) {
        // 02-24.2
        int tyhjia = koko - 1;
        int tahtia = 1;
        while (tahtia <= koko) {
            tulostaTyhjaa(tyhjia);
            tulostaTahtia(tahtia);
            tyhjia--;
            tahtia++;
        }
    }

    public static void jouluKuusi(int korkeus) {
        // 02-24.3
        int tahtia = 1;
        int tyhjia = korkeus - 1;
        int jalanKorkeus = 2;
        
        while (tahtia < 2 * korkeus) {
            tulostaTyhjaa(tyhjia);
            tulostaTahtia(tahtia);
            tyhjia--;
            tahtia += 2;
        }
        
        while (jalanKorkeus > 0) {
            tulostaTyhjaa(korkeus-2);
            tulostaTahtia(3);
            jalanKorkeus--;
        }
        
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}

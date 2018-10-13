

public class Main {

    public static void main(String[] args) {
        // Voit tehdä täällä tehtävään liittyviä kokeiluja
        Henkilo lapsi = new Henkilo("Bebe", 19, 12, 2017);
        System.out.println(lapsi.ikaVuosina());
        Henkilo thom = new Henkilo("Thom", 7, 10, 1968);
        System.out.println(thom.ikaVuosina());
        Henkilo synttaritHuomenna = new Henkilo("sh", 14, 10, 1896);
        System.out.println(synttaritHuomenna.ikaVuosina());
        Henkilo synttaritTanaan = new Henkilo("st", 13, 10, 1896);
        System.out.println(synttaritTanaan.ikaVuosina());
    }
}

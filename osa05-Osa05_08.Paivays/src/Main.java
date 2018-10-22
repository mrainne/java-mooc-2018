
public class Main {

    public static void main(String[] args) {
        // testaa luokkasi toimintaa täällä!
        Paivays tanaan = new Paivays(22, 10, 2018);
        Paivays kuunViimeinen = new Paivays(30, 10, 2018);
        Paivays vuodenViimeinen = new Paivays(30, 12, 2017);
        System.out.println("tänään:" + tanaan);
        tanaan.etene();
        System.out.println("huomenna: " + tanaan);
        
        
        System.out.println("kuun viimeinen: " + kuunViimeinen);
        kuunViimeinen.etene();
        System.out.println("kuun ensimmäinen: " + kuunViimeinen);
        
        System.out.println("vuoden viimeinen: " + vuodenViimeinen);
        vuodenViimeinen.etene();
        System.out.println("uusi vuosi: " + vuodenViimeinen);
       
        tanaan.etene(5);
        System.out.println("etene 5 päivää huomisesta: " + tanaan);
        
        Paivays pvm = new Paivays(13, 2, 2015);
        
        System.out.println("Tarkistellun viikon perjantai on " + pvm);

        Paivays uusiPvm = pvm.paivienPaasta(7);
        int vk = 1;
        while (vk <= 7) {
            System.out.println("Perjantai " + vk + " viikon kuluttua on " + uusiPvm);
            uusiPvm = uusiPvm.paivienPaasta(7);

            vk++;
        }


        System.out.println("Päivämäärä 790:n päivän päästä tarkistellusta perjantaista on ... kokeile itse!");
        System.out.println(pvm.paivienPaasta(790));
    }
}

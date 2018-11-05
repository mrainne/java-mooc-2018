
public class Main {

    public static void main(String[] args) {
        // voit tehdä tänne testikoodia

        // Jos ohjelmassa on useampi luokka, joka sisältää main-metodin, voi
        // halutun main metodin käynnistää valitsemalla luokka vasemmalla
        // olevasta projektilistauksesta ja painamalla oikealla
        // hiirennapilla "Run File"
        GameOfLife gol = new GameOfLife(3,3);
        Taulukko taulukko = new Taulukko(3, 3);
        taulukko.aseta(0, 0, true);
        taulukko.aseta(1, 0, false);
        taulukko.aseta(2, 0, false);
        taulukko.aseta(0, 1, true);
        taulukko.aseta(1, 1, true);
        taulukko.aseta(2, 1, false);
        taulukko.aseta(0, 2, false);
        taulukko.aseta(1, 2, false);
        taulukko.aseta(2, 2, true);
        System.out.println(gol.elossaOleviaNaapureita(taulukko, 0, 0));
        System.out.println(gol.elossaOleviaNaapureita(taulukko, 1, 0));
        System.out.println(gol.elossaOleviaNaapureita(taulukko, 1, 1));
        System.out.println(gol.elossaOleviaNaapureita(taulukko, 2, 2));
        
        
    }

}

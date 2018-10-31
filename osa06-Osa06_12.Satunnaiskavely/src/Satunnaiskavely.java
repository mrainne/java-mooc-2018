
import java.util.HashMap;
import java.util.Random;

public class Satunnaiskavely {

    private HashMap<Integer, HashMap<Integer, Double>> taulukko;
    private int sijaintiX = 0;
    private int sijaintiY = 0;

    public Satunnaiskavely(int leveys, int korkeus) {
        this.taulukko = new HashMap<>();
        int x = 0;
        while (x < leveys) {
            this.taulukko.putIfAbsent(x, new HashMap<>());

            int y = 0;
            while (y < korkeus) {
                this.taulukko.get(x).put(y, 0.0);
                y++;
            }
            
            x++;
        }

        this.sijaintiX = leveys / 2;
        this.sijaintiY = korkeus / 2;

        this.taulukko.get(this.sijaintiX).put(this.sijaintiY, 1.0);
    }

    public void askel() {
        // pienennetään hajujalkeä ????
        int x = 0; // mikä tämä on? ei x-koordinaatti
        while (x < this.taulukko.size()) {
            int y = 0; // ???
            while (y < this.taulukko.get(x).size()) {
                double arvo = this.taulukko.get(x).get(y); // mikä tämä on? 
                if (arvo > 0) {
                    arvo -= 0.01;
                }

                this.taulukko.get(x).put(y, arvo);
                y++;
            }
            
            x++;
        }
        
        double tn = new Random().nextInt(101) / 100.0;
        if (tn < 0.2) {
            liikuYlos();
        } else if (tn < 0.4) {
            liikuOikealle();
        } else if (tn < 0.6) {
            liikuAlas();
        } else if (tn < 0.8) {
            liikuVasemmalle();
        } else {
            pysy();
        }
        // kun hahmo on tietyssä pisteessä, asetetaan taulukkoon arvo 1
        // miksi?
        this.taulukko.get(this.sijaintiX).put(this.sijaintiY, 1.0);
    }
    
    private void liikuYlos() {
        this.sijaintiY += 1;
    }
    
    private void liikuOikealle() {
        this.sijaintiX += 1;
    }

    private void liikuAlas() {
        this.sijaintiY -= 1;
    }
    
    private void liikuVasemmalle() {
        this.sijaintiX -= 1;
    }
    
    private void pysy() {
    }
    
    public HashMap<Integer, HashMap<Integer, Double>> getTaulukko() {
        return taulukko;
    }

    public void setTaulukko(HashMap<Integer, HashMap<Integer, Double>> taulukko) {
        this.taulukko = taulukko;
    }
}

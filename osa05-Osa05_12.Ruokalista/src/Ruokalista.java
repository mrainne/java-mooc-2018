
import java.util.ArrayList;

public class Ruokalista {

    private ArrayList<String> ateriat;

    public Ruokalista() {
        this.ateriat = new ArrayList<>();
    }

    // toteuta tänne tarvittavat metodit
    public void lisaaAteria(String ateria) {
        if (!(this.ateriat.contains(ateria))) {
            this.ateriat.add(ateria);
        }
    }
    
    public void tulostaAteriat() {
        int index = 0;
        while (index < this.ateriat.size()) {
            System.out.println(this.ateriat.get(index));
            index++;
        }
    }
    
    public void tyhjennaRuokalista() {
        this.ateriat.clear();
    }
}

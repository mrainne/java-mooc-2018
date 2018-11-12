import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Palauteanalyytikko {
    private ArrayList<Palaute> palautteet;
    
    public Palauteanalyytikko() {
        this.palautteet = new ArrayList<>();
    }
    
    public void add(Palaute p) {
        palautteet.add(p);
    }
    
    public double palautteidenKeskiarvo() {
        if (palautteet.isEmpty()) {
            return -1;
        }
        
        double summa = 0.0;
        for (Palaute p: palautteet) {
            summa += p.annaArvosana();
        }
        return summa / palautteet.size();
    }
    
    public ArrayList<Palaute> palautteetValilta(int alku, int loppu) {
        ArrayList<Palaute> valilta = new ArrayList<>();
        for (Palaute p: palautteet) {
            if (p.annaArvosana() >= alku && p.annaArvosana() <= loppu) {
                valilta.add(p);
            }
        }
        return valilta;
    }
    
    @Override
    public String toString() {
        String tuloste = "Palautteet:\n";
        for (Palaute p: palautteet) {
            tuloste += "* " + p + "\n";
        }
        return tuloste;
    }
}

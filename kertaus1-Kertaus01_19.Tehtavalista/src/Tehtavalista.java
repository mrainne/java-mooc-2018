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
public class Tehtavalista {
    private ArrayList<Tehtava> tehtavat;
    
    public Tehtavalista() {
        this.tehtavat = new ArrayList<>();
    }
    
    public void lisaa(String tehtava) {
        this.tehtavat.add(new Tehtava(tehtava));
    }
    
    public void asetaTehdyksi(String tehtava) {
        for (Tehtava t: tehtavat) {
            if (t.getTehtava().equals(tehtava)) {
                t.asetaTehdyksi();
                return;
            }
        }
    }    
    
    public Tehtava annaTehtava(String tehtava) {
        for (Tehtava t: tehtavat) {
            if (t.getTehtava().equals(tehtava)) {
                return t;
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        String tulostus = "Tehtavat \n";
        for (Tehtava t: tehtavat) {
            tulostus += "*" + t + "\n";
        }
        return tulostus;
    }
}


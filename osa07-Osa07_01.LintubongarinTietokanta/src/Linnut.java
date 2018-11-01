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
public class Linnut {
    private ArrayList<Lintu> linnut;
    
    public Linnut() {
        this.linnut = new ArrayList<>();
    }
    
    public void lisaaLintu(Lintu lintu) {
        this.linnut.add(lintu);
    }
    
    public ArrayList<Lintu> getLinnut() {
        ArrayList<Lintu> kaikkiLinnut = new ArrayList<>();
        for (Lintu l: linnut) {
            kaikkiLinnut.add(l);
        }
        return kaikkiLinnut;
    }
    
    public Lintu onkoLintuListalla(String nimi) {
        for (Lintu l: linnut) {
            if (l.nimi().equals(nimi)) {
                return l;
            }
        }
        return null;
    }
}

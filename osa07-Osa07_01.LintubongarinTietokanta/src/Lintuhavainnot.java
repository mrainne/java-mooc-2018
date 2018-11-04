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
public class Lintuhavainnot {
    // havainto sisältää tiedon linnusta ja havaintokertojen lukumäärästä
    private ArrayList<Lintu> linnut;
    
    public Lintuhavainnot() {
        this.linnut = new ArrayList<>();
    }
    
    public void lisaaHavainto(Lintu lintu) {
        linnut.add(lintu);
    }
    
    public Lintu haeNimella(String nimi) {
        for (Lintu lintu: linnut) {
            if (lintu.nimi().equals(nimi)) {
                return lintu;
            }
        }
        return null;
    }
    
    public void tulostaHavainnot() {
        for (Lintu l: linnut) {
            System.out.println(l);
        }
    }
}


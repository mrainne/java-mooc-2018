import java.util.HashMap;
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
    private HashMap<Lintu, Integer> havainnot;
    
    public Lintuhavainnot() {
        this.havainnot = new HashMap<>();
    }
    
    public void lisaaHavainto(Lintu lintu) {
        int havaintoja = havaintojenLkm(lintu);
        this.havainnot.put(lintu, havaintoja + 1);
    }
    
    public int havaintojenLkm(Lintu lintu) {
        // palautetaan havaintojen määrä tai 0, mikäli aiempia havaintoja ei ole.
        return this.havainnot.getOrDefault(lintu, 0);
    }
    
    public String havainto(Lintu lintu) {
        return ": " + this.havainnot.getOrDefault(lintu, 0) + " havaintoa";
    }
}

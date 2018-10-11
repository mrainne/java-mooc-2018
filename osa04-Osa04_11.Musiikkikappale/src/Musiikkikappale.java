/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marianne
 */
public class Musiikkikappale {
    private String nimi;
    private int pituus; // sekunteina
    
    public Musiikkikappale(String nimiAlussa, int pituusAlussa) {
        this.nimi = nimiAlussa;
        this.pituus = pituusAlussa;
    }
    
    public String nimi() {
        return this.nimi;
    }
    
    public int pituus() {
        return this.pituus;
    }
}

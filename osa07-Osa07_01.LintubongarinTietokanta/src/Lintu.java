/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Lintu {
    private String nimi;
    private String nimiLatinaksi;
    private int havaintojenLkm;
    
    public Lintu(String nimi, String latina) {
        this.nimi = nimi;
        this.nimiLatinaksi = latina;
        this.havaintojenLkm = 0;
    }
    
    public String nimi() {
        return this.nimi;
    }
    
    public String nimiLatinaksi() {
        return this.nimiLatinaksi;
    }
    
    public int havaintojenLkm() {
        return this.havaintojenLkm;
    }
    
    public void lisaaHavainto() {
        this.havaintojenLkm++;
    }
    @Override
    public String toString() {
        return this.nimi + " (" + this.nimiLatinaksi + "): " + this.havaintojenLkm + " havaintoa";
    }
}

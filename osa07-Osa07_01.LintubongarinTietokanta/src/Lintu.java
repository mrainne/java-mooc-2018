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
    
    public Lintu(String nimi, String latina) {
        this.nimi = nimi;
        this.nimiLatinaksi = latina;
    }
    
    public String nimi() {
        return this.nimi;
    }
    
    public String nimiLatinaksi() {
        return this.nimiLatinaksi;
    }
    
    @Override
    public String toString() {
        return this.nimi + " (" + this.nimiLatinaksi + ")";
    }
}

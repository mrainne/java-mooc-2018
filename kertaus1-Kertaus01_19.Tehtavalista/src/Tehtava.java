/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Tehtava {
    private String tehtava; // tehtävän kuvaus
    private String tehty; // onko tehtävä tehty
    
    public Tehtava(String tehtava) {
        this.tehtava = tehtava;
        this.tehty = "ei tehty";
    }
    
    public String getTehtava() {
        return this.tehtava;
    }
    
    public String getTehty() {
        return this.tehty;
    }
    
    public void asetaTehdyksi() {
        this.tehty = "tehty";
    } 
    
    public void asetaTekemattomaksi() {
        this.tehty = "ei tehty";
    }
    
    public String toString() {
        return this.tehtava + "(" + this.tehty + ")";
    }
}

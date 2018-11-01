import java.util.HashMap;
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
public class Sanakirja {
    private HashMap<String, String> sanakirja;
    
    public Sanakirja() {
        this.sanakirja = new HashMap<>();
    }
    
    public void lisaa(String sana, String kaannos) {
        this.sanakirja.put(sana, kaannos);
    }
    
    public String kaanna(String sana) {
        return this.sanakirja.get(sana);
    }
    
    public int sanojenLukumaara() {
        return this.sanakirja.size();
    }
    
    public ArrayList<String> kaannoksetListana() {
        ArrayList<String> kaannokset = new ArrayList<>();
        this.sanakirja.forEach((k, v) -> kaannokset.add(k + " = " + v));
        return kaannokset;
    }
}

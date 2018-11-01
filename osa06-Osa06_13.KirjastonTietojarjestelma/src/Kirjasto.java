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
public class Kirjasto {
    private ArrayList<Kirja> kirjat;
    
    public Kirjasto() {
        this.kirjat = new ArrayList<>();
    }
    
    public void lisaaKirja(Kirja uusiKirja) {
        kirjat.add(uusiKirja);
    }
    
    public void tulostaKirjat() {
        for (Kirja k: kirjat) {
            System.out.println(k);
        }
    }
    
    public ArrayList<Kirja> haeKirjaNimekkeella(String nimeke) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        
        for (Kirja k: kirjat) {
            if (StringUtils.sisaltaa(k.nimeke(), nimeke)) {
                loydetyt.add(k);
            }
        }
        return loydetyt;
    }
    
    public ArrayList<Kirja> haeKirjaJulkaisijalla(String julkaisija) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        
        for (Kirja k: kirjat) {
            if (StringUtils.sisaltaa(k.julkaisija(),julkaisija)) {
                loydetyt.add(k);
            }
        }
        return loydetyt;
    }
    
    public ArrayList<Kirja> haeKirjaJulkaisuvuodella(int julkaisuvuosi) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        
        for (Kirja k: kirjat) {
            if (k.julkaisuvuosi() == julkaisuvuosi) {
                loydetyt.add(k);
            }
        }
        return loydetyt;
    }
}

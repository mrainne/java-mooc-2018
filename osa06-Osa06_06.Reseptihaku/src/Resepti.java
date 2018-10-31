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
public class Resepti {
    private String nimi;
    private int aika;
    private ArrayList<String> aineet;
    
    public Resepti(String nimi, int keittoaika) {
        this.nimi = nimi;
        this.aika = keittoaika;
        this.aineet = new ArrayList<>();
    }
    
    public void lisaaRaakaAine(String aine) {
        this.aineet.add(aine);
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public int getKeittoaika() {
        return this.aika;
    }
    
    public ArrayList<String> getRaakaAineet() {
        return this.aineet;
    }
    
    public void tulostaResepti() {
        System.out.println(this.getNimi() + ", keittoaika: " + this.getKeittoaika());
    }
}

import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marianne
 */
public class Puhelinmuistio {
    private ArrayList<Henkilo> henkilot;
    
    public Puhelinmuistio() {
        this.henkilot = new ArrayList<>();
    }
    public void lisaa(String nimi, String numero) {
        Henkilo uusiHenkilo = new Henkilo(nimi, numero);
        this.henkilot.add(uusiHenkilo);
    }
    
    public void tulostaKaikki() {
        int index = 0;
        while (index < this.henkilot.size()) {
            System.out.println(this.henkilot.get(index));
            index++;
        }
    }
    
    public String haeNumero(String nimi) {
        int index = 0;
        while (index < this.henkilot.size()) {
            Henkilo h = this.henkilot.get(index);
            if (h.getNimi().equals(nimi)) {
                return h.getNumero();
            }
            index++;
        }
        return "numero ei tiedossa";
    }
}

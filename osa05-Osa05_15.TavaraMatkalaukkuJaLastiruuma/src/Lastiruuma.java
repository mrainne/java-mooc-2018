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
public class Lastiruuma {
    private ArrayList<Matkalaukku> laukut;
    private int maksimiPaino;
    
    public Lastiruuma(int maksimipaino) {
        this.maksimiPaino = maksimipaino;
        this.laukut = new ArrayList<>();
    }
    
    public int laukkujenYhteispaino() {
        int paino = 0;
        for (Matkalaukku l: laukut) {
            paino += l.yhteispaino();
        }
        return paino;
    }
    
    public void lisaaMatkalaukku(Matkalaukku laukku) {
        if (laukku.yhteispaino() + laukkujenYhteispaino() > maksimiPaino) {
            return;
        }
        this.laukut.add(laukku);
    }
    
    public void tulostaTavarat() {
        for (Matkalaukku l: this.laukut) {
            l.tulostaTavarat();
        }
    }
    
    public String toString() {
        if (this.laukut.isEmpty()) {
            return "ei matkalaukkuja (0 kg)";
        }
        
        if (this.laukut.size() == 1) {
            return "1 matkalaukku (" + this.laukkujenYhteispaino() + " kg)";
        }
        
        return laukut.size() + " matkalaukkua (" + this.laukkujenYhteispaino() + " kg)";
    }
}

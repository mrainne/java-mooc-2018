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
public class Matkalaukku {
    private ArrayList<Tavara> matkatavarat;
    private int maksimipaino; // matkatavaroiden maksimipaino
    
    public Matkalaukku(int maksimipaino) {
        this.matkatavarat = new ArrayList<>();
        this.maksimipaino = maksimipaino;
    }
    
    public void lisaaTavara(Tavara tavara) {
        if (tavara.getPaino() + yhteispaino() <= this.maksimipaino) {
            this.matkatavarat.add(tavara);
        }
    }
    
    public String toString() {
        int paino = yhteispaino();
        
        int maara = this.matkatavarat.size();
        String alku;
        if (this.matkatavarat.isEmpty()) {
            return "ei tavaroita (0 kg)";
        }
        
        if (maara == 1) {
            return "1 tavara (" + paino + " kg)";
        } 
        
        return maara + " tavaraa (" + paino + " kg)";
    }
    
    public void tulostaTavarat() {
        for (Tavara t: this.matkatavarat) {
            System.out.println(t);
        }
    }
    
    public int yhteispaino() {
        int yhteispaino = 0;
        for (Tavara t: this.matkatavarat) {
            yhteispaino += t.getPaino();
        }
        return yhteispaino;
    }
    
    public Tavara raskainTavara() {
        if (this.matkatavarat.isEmpty()) {
            return null;
        }
        
        Tavara raskain = this.matkatavarat.get(0);
        int raskainPaino = raskain.getPaino();

        if (this.matkatavarat.size() > 0) {
            for (Tavara t: this.matkatavarat) {
                int tavaranPaino = t.getPaino();
                if (tavaranPaino > raskainPaino) {
                    raskainPaino = tavaranPaino;
                    raskain = t;
                }
            }
        }
        return raskain;

    }
}

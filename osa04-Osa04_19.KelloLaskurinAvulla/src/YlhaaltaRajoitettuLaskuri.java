/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marianne
 */
public class YlhaaltaRajoitettuLaskuri {
    private int arvo;
    private int ylaraja;
    
    public YlhaaltaRajoitettuLaskuri(int ylarajaAlussa) {
        this.arvo = 0;
        this.ylaraja = ylarajaAlussa;
    }
    
    public void seuraava() {
        if (this.arvo < this.ylaraja) {
            this.arvo++;
        } else {
            this.arvo = 0;
        }
    }
    
    public String toString() {
        if (this.arvo < 10) {
            return "0" + this.arvo;
        } else {
            return "" + this.arvo;
        }
    }
    
    public int arvo() {
        return this.arvo;
    }
    
    public void asetaArvo(int arvo) {
        if (arvo <= this.ylaraja && arvo >= 0) {
            this.arvo = arvo;
        }
    }
}

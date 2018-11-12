/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Palaute {
    private String palaute;
    private int arvosana; // arvosana [1-5]
    
    public Palaute(String palaute, int arvosana) {
        this.palaute = palaute;
        this.arvosana = arvosana;
    }
    
    public int annaArvosana() {
        return this.arvosana;
    }
    
    @Override
    public String toString() {
        return "(" + this.arvosana + "/5) " + palaute;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Ympyra {
    private double x; // keskipisteen x-koordinaatti
    private double y; // keskipisteen y-koordinaatti
    private double sade; // ympyrän säde
    
    public Ympyra(double x, double y, double sade) {
        this.x = x;
        this.y = y;
        this.sade = sade;
    }
    
    public Piste keskipiste() {
        return new Piste(this.x, this.y);
    }
    
    public double getSade() {
        return this.sade;
    }
    
    
    public boolean osuuko(Ympyra toinen) {
        // ympyrät on sisäkkäin, jos niiden keskipisteiden etäisyys on pienempi
        // tai yhtäsuuri kuin ympyröiden säteiden summa
        return (this.keskipiste().etaisyys(toinen.keskipiste()) <= (toinen.getSade() + this.getSade()));
    }
}

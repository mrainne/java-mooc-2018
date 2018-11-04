import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Kayttoliittyma {
    private Scanner lukija;
    private Lintu lintu;
    private Lintuhavainnot havainnot;
    
    
    public Kayttoliittyma(Scanner lukija) {
        this.lukija = lukija;
        this.havainnot = new Lintuhavainnot();
    }
    
    public void kaynnista() {
        System.out.println("Komennot:");
        System.out.println("Lisaa - lisää linnun");
        System.out.println("Havainto - lisää havainnon");
        System.out.println("Tilasto - tulostaa kaikki linnut");
        System.out.println("Nayta - tulostaa yhden linnun ");
        System.out.println("Lopeta - lopettaa ohjelman");
        
        while (true) {
            String komento = kysy("?");
            
            if (komento.toLowerCase().equals("lopeta")) {
                break;
            } else if (komento.toLowerCase().equals("lisaa")) {
                lisaa();
            } else if (komento.toLowerCase().equals("havainto")) {
                havainto();
            } else if (komento.toLowerCase().equals("tilasto")) {
                tilasto();
            } else if (komento.toLowerCase().equals("nayta")) {
                nayta();
            }
        }
    }
    
    public String kysy(String kysymys) {
        System.out.print(kysymys + " ");
        return lukija.nextLine().trim();
    }
    
    public void lisaa() {
        String nimi = kysy("Nimi:");
        String latina = kysy("Latinankielinen nimi:");
        
        havainnot.lisaaHavainto(new Lintu(nimi, latina));
    }
    
    public void havainto() {
        String nimi = kysy("Nimi:");
        Lintu l = havainnot.haeNimella(nimi);
        if (l == null) {
            System.out.println("Ei ole lintu");
        } else {
            l.lisaaHavainto();
        }
    }
    
    public void tilasto() {
        havainnot.tulostaHavainnot();
    }
    
    public void nayta() {
        String nimi = kysy("Mikä?");
        System.out.println(havainnot.haeNimella(nimi));
    }
}

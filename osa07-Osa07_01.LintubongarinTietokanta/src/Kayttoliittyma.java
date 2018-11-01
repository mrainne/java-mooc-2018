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
    private Linnut linnut;
    private Lintuhavainnot havainnot;
    
    
    public Kayttoliittyma(Scanner lukija) {
        this.lukija = lukija;
        this.havainnot = new Lintuhavainnot();
        this.linnut = new Linnut();
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
            
            if (komento.equals("Lopeta")) {
                break;
            } else if (komento.equals("Lisaa")) {
                lisaa();
            } else if (komento.equals("Havainto")) {
                havainto();
            } else if (komento.equals("Tilasto")) {
                tilasto();
            } else if (komento.equals("Nayta")) {
                nayta();
            }
        }
    }
    
    public String kysy(String kysymys) {
        System.out.print(kysymys + " ");
        return lukija.nextLine();
    }
    
    public void lisaa() {
        String nimi = kysy("Nimi: ");
        String latina = kysy("Latinankielinen nimi: ");
        
        linnut.lisaaLintu(new Lintu(nimi, latina));
    }
    
    public void havainto() {
        String nimi = kysy("Nimi: ");
        Lintu onkoLintu = linnut.onkoLintuListalla(nimi);
        if (onkoLintu == null) {
            System.out.println("Ei ole lintu!");
        } else {
            havainnot.lisaaHavainto(onkoLintu);
        }
        
    }
    
    public void tilasto() {
        for (Lintu l: linnut.getLinnut()) {
            System.out.println(l + havainnot.havainto(l));
        }
    }
    
    public void nayta() {
        String nimi = kysy("Mikä ?");
        Lintu onkoLintu = linnut.onkoLintuListalla(nimi);
        System.out.println(onkoLintu + havainnot.havainto(onkoLintu));
    }
}

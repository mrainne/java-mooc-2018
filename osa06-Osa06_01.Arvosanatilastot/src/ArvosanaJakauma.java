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
public class ArvosanaJakauma {
    private ArrayList<Integer> pisteet;
    
    public ArvosanaJakauma() {
        this.pisteet = new ArrayList<>();
    }
    
    public void lisaaPisteet(int pistemaara) {
        if (pistemaara < 0 || pistemaara > 100) {
            return;
        }
        this.pisteet.add(pistemaara);
    }
        
    public void tulosta() {
        double summa = 0;
        int hyvaksyttyja = 0;
        double hyvaksyttyjenSumma = 0;
        
        for (Integer piste: pisteet) {
            summa += piste;
            if (piste >= 70) {
                hyvaksyttyja++;
                hyvaksyttyjenSumma += piste;
            }
        }
        
        System.out.println("Pisteiden keskiarvo (kaikki): " + summa / this.pisteet.size());
        
        if (hyvaksyttyja > 0) {
            System.out.println("Pisteiden keskiarvo (hyväksytyt): " + 1.0 * hyvaksyttyjenSumma / hyvaksyttyja);
        } else {
            System.out.println("Pisteiden keskiarvo (hyväksytyt): -");
        }
        
        System.out.println("Hyväksymisprosentti: " + 100.0 * hyvaksyttyja / this.pisteet.size());
        System.out.println("Arvosanajakauma: ");
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + tahtienTulostus(i));
        }
    }
        
    private String tahtienTulostus(int arvosana) {
        int montakotahtea = 0;
        for (Integer piste: pisteet) {
            if (laskeArvosana(piste) == arvosana) {
                montakotahtea++;
            }
        }
        return tahtia(montakotahtea);
    }
    
    private String tahtia(int n) {
        String tahtia = "";
        for (int i = 0; i < n; i++) {
            tahtia += "*";
        }
    
        return tahtia;
    }
    
    private int laskeArvosana(int pisteet) {
        int arvosana = 5;
        
        if (pisteet < 70) {
            arvosana = 0;
        } else if (pisteet < 76) {
            arvosana = 1;
        } else if (pisteet < 81) {
            arvosana = 2;
        } else if (pisteet < 86) {
            arvosana = 3;
        } else if (pisteet < 91) {
            arvosana = 4;
        }
        return arvosana;
    }    

}

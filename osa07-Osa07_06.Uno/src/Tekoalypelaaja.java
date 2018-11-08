
import java.util.ArrayList;
import java.util.HashMap;

// luo tänne luokkaan oma tekoälysi Uno-peliä varten
public class Tekoalypelaaja implements Pelaaja {

    // Saat luoda tarvittaessa oliomuuttujia. Jos luot konstruktorin, varmista
    // että tekoäly toimii myös parametrittomalla konstruktorilla, eli kutsulla
    // Tekoalypelaaja pelaaja = new Tekoalypelaaja();
    @Override
    public int pelaa(ArrayList<Kortti> omatKortit, Kortti paallimmaisin, String vari, Pelitilanne tilanne) {
        for (int i = 0; i < omatKortit.size(); i++) {
            if (omatKortit.get(i).saaPelataKortin(paallimmaisin, vari)) {
                return i;
            }
            
        }
        return -1;
    }

    @Override
    public String valitseVari(ArrayList<Kortti> omatKortit) {
        String[] okVarit = {"Punainen", "Vihreä", "Sininen", "Keltainen"};
        HashMap<String, Integer> omatVarit = new HashMap<>();
        int suurin = 0;
        String variJotaEniten = "";
        
        for (Kortti kortti: omatKortit) {
            String kortinVari = kortti.getVari();
                omatVarit.put(kortinVari, omatVarit.getOrDefault(kortinVari, 0) + 1);
            }
        
        for (String vari: okVarit) {
            if (omatVarit.getOrDefault(vari, 0) > suurin) {
                variJotaEniten = vari;
                suurin = omatVarit.get(vari);
            }
        }
        
        if (variJotaEniten.isEmpty()) {
            variJotaEniten = okVarit[0];
        }
        return variJotaEniten;
        
    }
    
    @Override
    public String nimi() {
        // kirjoita tänne nimimerkkisi, jonka haluat mahdollisesti näkyvän 
        // myös muualla

        return "Esimerkki";
    }

}

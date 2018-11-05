import java.util.HashMap;
import java.util.ArrayList;

public class UseanKaannoksenSanakirja {
    private HashMap<String, ArrayList<String>> sanat;
    
    public UseanKaannoksenSanakirja() {
        this.sanat = new HashMap<>();
    }
    
    public void lisaa(String sana, String kaannos) {
        this.sanat.putIfAbsent(sana, new ArrayList<>());
        
        this.sanat.get(sana).add(kaannos);
    }
    
    public ArrayList<String> kaanna(String sana) {
        return this.sanat.getOrDefault(sana, new ArrayList<String>());
    }
    
    public void poista(String sana) {
        this.sanat.remove(sana);
    }
}

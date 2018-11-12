import java.util.HashMap;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Ruudukko {
    private HashMap<Integer, HashMap<Integer, String>> suorakulmiot;
    private int leveys = 5;
    private int korkeus = 5;
    
    public Ruudukko() {
        this.suorakulmiot = new HashMap<>();
        int y = 0;
        while (y <= this.korkeus) {
            this.suorakulmiot.putIfAbsent(y, new HashMap<>());

            int x = 0;
            while (x <= this.leveys) {
                this.suorakulmiot.get(y).put(x, " ");
                x++;
            }
            
            y++;
        }

    }
   
    public void lisaa(Suorakulmio s) {
        int y = s.getY();
        while (y < s.getY() + s.getKorkeus()) {
            this.suorakulmiot.putIfAbsent(y, new HashMap<>());
            
            int x = s.getX();
            while (x < s.getX() + s.getLeveys()) {
                this.suorakulmiot.get(y).put(x, "x");
                x++;
            }
            y++;
        }
    }
    
    @Override
    public String toString() {
        String rivit = "";
        for (int i = 0; i < suorakulmiot.size(); i++) {
            for (int j = 0; j < suorakulmiot.get(i).size(); j++) {
                rivit += suorakulmiot.get(i).get(j);
            }
            rivit += "\n";
        }
        return rivit;
    }
}

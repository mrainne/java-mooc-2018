
public class Kasvatuslaitos {
    private int punnituksia = 0;

    public int punnitse(Henkilo henkilo) {
        // palautetaan parametrina annetun henkilön paino
        this.punnituksia++;
        return henkilo.getPaino();
    }
    
    public void syota(Henkilo henkilo) {
        henkilo.setPaino(henkilo.getPaino() + 1);
    }
    
    public int punnitukset() {
        return this.punnituksia;
    }
}

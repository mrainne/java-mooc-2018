import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class TehtavienhallintaTest {
    private Tehtavienhallinta hallinta;
    
    @Before
    public void alusta() {
        hallinta = new Tehtavienhallinta();
    }
    
    @Test
    public void tehtavalistaAlussaTyhja(){
        assertEquals(0, hallinta.tehtavalista().size());
    }
    
    @Test
    public void tehtavanLisaaminenKasvattaaListanKokoaYhdella() {
        hallinta.lisaa("Kirjoita testi");
        assertEquals(1, hallinta.tehtavalista().size());
    }
    
    @Test
    public void lisattyTehtavaLoytyyTehtavalistalta() {
        hallinta.lisaa("Kirjoita testi");
        assertTrue(hallinta.tehtavalista().contains("Kirjoita testi"));
    }
    
    @Test
    public void tehtavanVoiMerkataTehdyksi() {
        hallinta.lisaa("satunnainen tehtävä");
        hallinta.merkkaaTehdyksi("satunnainen tehtävä");
    }
    
    @Test
    public void tehdyksiMerkattuOnTehty() {
        hallinta.lisaa("uusi tehtävä");
        hallinta.merkkaaTehdyksi("uusi tehtävä");
        assertTrue(hallinta.onTehty("uusi tehtävä"));
    }
    
    @Test
    public void tehdyksiMerkkaamatonEiOleTehty() {
        hallinta.lisaa("uusi tehtävä");
        hallinta.merkkaaTehdyksi("uusi tehtävä");
        assertFalse(hallinta.onTehty("joku tehtävä"));
    }
    
    @Test
    public void tehtavanPoistaminenPienentaaListanKokoaYhdella() {
        hallinta.lisaa("poistettava tehtävä");
        hallinta.poista("poistettava tehtävä");
        assertEquals(0, hallinta.tehtavalista().size());
    }
    
    @Test
    public void poistettuTehtavaEiLoydyTehtavalistalta() {
        hallinta.lisaa("uusi tehtävä");
        hallinta.poista("uusi tehtävä");
        assertFalse(hallinta.tehtavalista().contains("uusi tehtävä"));
    }
}


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

// Luokka (ohjelma) Puisevaa "perii" graafisen käyttöliittymän rakentamiseen
// tarvittavia ominaisuuksia Application-luokalta (ohjelmalta)
public class Puisevaa extends Application {

    // Käyttöliittymän käynnistäminen kutsuu metodia alla olevaa
    // metodia
    @Override
    public void start(Stage ikkuna) throws Exception {

        // luodaan 640 pikseliä leveä ja 480 pikseliä korkea alusta
        // piirtämiselle ja otetaan alustaan liittyvä piirtoväline
        // käyttöön
        Canvas piirtoalusta = new Canvas(640, 480);
        GraphicsContext piirturi = piirtoalusta.getGraphicsContext2D();

        // kutsutaan piirtämiseen käytettävää metodia piirrä
        // -- metodiin tullaan toteuttamaan piirtotoiminnallisuus
        piirra(piirturi);

        // asetetaan käyttöliittymän osat paikalleen ja 
        // näytetään se käyttäjälle
        Pane ruutu = new Pane(piirtoalusta);
        Scene nakyma = new Scene(ruutu);

        ikkuna.setTitle("Niin hyvää puuta!");
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    // Ohjelma käynnistetään metodilla public static void main. 
    // Metodissa kutsutaan Application luokalta perittyä toiminnallisuutta, 
    // joka lopulta suorittaa yllä kuvatun start-metodin
    public static void main(String[] args) {
        launch(Puisevaa.class);
    }

    // Oma piirra-metodimme, jonne toteutetaan piirtotoiminnallisuus
    public static void piirra(GraphicsContext piirturi) {

        //piirretään viisi ympyrää, joiden halkaisija on 80 pikseliä
        //vasempaan ja oikeaa reunaan jätetään tilaa 50 pikseliä
        //ympyröiden väliin jää 20 pikseliä
        //ympyrän alalaidasta piirretään 100 pikseliä pitkä viiva
        //vuoraan alas
        int xYmp = 50; //ympyrän "lähtöpisteen" x-koordinaatti
        int d = 80; //halkaisija
        int valiYmp = 35;
        int kuvioita = 5;
        while (kuvioita > 0) {
            int xViiva = xYmp + d/2; //viivan "lähtöpisteen" x-koordinaatti
            piirturi.strokeOval(xYmp, 100, d, d);
            piirturi.strokeLine(xViiva, 180, xViiva, 400);
            xYmp = xYmp + d + valiYmp;
            kuvioita--;
        }
        
        piirturi.strokeRect(0, 380, 640, 100);
        //piirturi.strokeLine(0, 480, 0, 380);
        //piirturi.strokeLine(0, 380, 640, 380);

    }

}


import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class StackyWindowsSovellus extends Application {

    public void start(Stage stage) {
        final int ikkunanLeveys = 640;
        final int ikkunanKorkeus = 480;

        stage.setTitle("StackyWindows 1.0");

        Group root = new Group();
        Scene scene = new Scene(root);
        stage.setScene(scene);

        Canvas piirtoalusta = new Canvas(ikkunanLeveys, ikkunanKorkeus);
        root.getChildren().add(piirtoalusta);

        GraphicsContext piirturi = piirtoalusta.getGraphicsContext2D();

        ArrayList<Ikkuna> ikkunat = new ArrayList<>();
        ikkunat.add(new Ikkuna(200, 40, 200, 400, Color.GREEN));
        ikkunat.add(new Ikkuna(250, 70, 250, 300, Color.RED));
        ikkunat.add(new Ikkuna(30, 80, 200, 300, Color.BLUE));

        int[] alkupiste = new int[2]; // 
        
        root.setOnMousePressed((MouseEvent event) -> {
            System.out.println("mouse click " + event.getSource());
            System.out.println("\t" + event.getX());
            System.out.println("\t" + event.getY());
            alkupiste[0] = (int)event.getX();
            alkupiste[1] = (int)event.getY();
            for (Ikkuna ikkuna: ikkunat) {
                if (!ikkuna.ulkopuolella(alkupiste[0], alkupiste[1])) {
                    ikkunat.remove(ikkuna);
                    ikkunat.add(ikkuna);
                    return;
                }
            }
            
        });

        root.setOnMouseDragged((MouseEvent event) -> {
            System.out.println("moving mouse, mouse down!");
            System.out.println("\t" + event.getX());
            System.out.println("\t" + event.getY());

            // huom! jos haluat tarkastella hiiren siirtymisiä, tarvitset 
            // viittaustyyppisen muuttujan, jossa pidetään 
            // kirjaa hiiren aiemmasta sijainnista..   
            int alkuX = (int)event.getX();
            int alkuY = (int)event.getY();
            
            int muutosX = alkuX - alkupiste[0];
            int muutosY = alkuY - alkupiste[1];
            
            int uusiX = ikkunat.get(ikkunat.size()-1).getX() + muutosX;
            int uusiY = ikkunat.get(ikkunat.size()-1).getY() + muutosY;
            
            ikkunat.get(ikkunat.size()-1).setX(uusiX);
            ikkunat.get(ikkunat.size()-1).setY(uusiY);     
        });

        new AnimationTimer() {
            public void handle(long currentNanoTime) {
                piirturi.clearRect(0, 0, ikkunanLeveys, ikkunanKorkeus);

                for (Ikkuna ikkuna : ikkunat) {
                    piirturi.setFill(ikkuna.getVari());
                    piirturi.fillRect(ikkuna.getX(), ikkuna.getY(), ikkuna.getLeveys(), ikkuna.getKorkeus());
                }
            }
        }.start();

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}

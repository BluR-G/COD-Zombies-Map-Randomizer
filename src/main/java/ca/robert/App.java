package ca.robert;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private Scene scene;
    private Parent root; 

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("base.fxml"));
        root = loader.load();
        stage.getIcons().add(new Image("file:src/main/resources/ca/robert/img/UI/Icon.png"));
        stage.setTitle("COD Zombie Map Randomizer");
        stage.setResizable(false);
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }    
    public static void main(String[] args) {
        launch();
    }

}
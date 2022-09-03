package ca.robert;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
        BaseController baseController = loader.getController();
        baseController.load();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }    
    public static void main(String[] args) {
        launch();
    }

}
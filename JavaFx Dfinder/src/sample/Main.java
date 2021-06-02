package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("HomeScene.fxml")));
        stage.getIcons().add(new Image("file:C:\\Users\\SAAD\\Desktop\\logo\\D-logos_black.png"));
        stage.setTitle("Dfinder");
        stage.setScene(new Scene(root, 852, 600));
        stage.setResizable(false);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}

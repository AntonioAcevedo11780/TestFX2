package mx.edu.utez.testfx2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/mx/edu/utez/testfx2/hello-view.fxml"));

        Label myLabel = new Label("Antonio Acevedo Osorio");
        StackPane root = new StackPane(myLabel);

        Scene scene = new Scene(root, 200, 200);
        // scene.getStylesheets().add(getClass().getResource("/mx/edu/utez/testfx2/styles.css").toExternalForm());

        stage.setTitle("Test de botón JavaFX");
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/mx/edu/utez/testfx2/icons/home.png")));
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

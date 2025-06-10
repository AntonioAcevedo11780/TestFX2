package mx.edu.utez.testfx2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/mx/edu/utez/testfx2/hello-view.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root, 600, 600);
        scene.getStylesheets().add(
                Objects.requireNonNull(getClass().getResource("/mx/edu/utez/testfx2/styles.css")).toExternalForm()
        );

        stage.setTitle("Formulario");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

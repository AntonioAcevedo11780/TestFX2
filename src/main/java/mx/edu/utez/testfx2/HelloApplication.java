package mx.edu.utez.testfx2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {

        Label titulo = new Label("Formulario");
        titulo.getStyleClass().add("title");
        titulo.setStyle("-fx-font-size: 24px; -fx-font-weight: bold; -fx-text-fill: #2F4F2F;");

        TextField txtNombre = new TextField();
        txtNombre.setPromptText("Nombre");
        txtNombre.getStyleClass().add("input-field");

        TextField txtEdad = new TextField();
        txtEdad.setPromptText("Edad");
        txtEdad.getStyleClass().add("input-field");

        ComboBox<String> comboTipo = new ComboBox<>();
        comboTipo.getItems().addAll("Estudiante", "Profesor", "Admin");
        comboTipo.setPromptText("Profesor");
        comboTipo.getStyleClass().addAll("input-field", "combo-box");

        Button btnCrear = new Button("Crear");
        btnCrear.getStyleClass().add("create-button");

        Label lblResultado = new Label();
        lblResultado.getStyleClass().add("result-label");


        GridPane grid = new GridPane();
        grid.getStyleClass().add("form-container");

        grid.add(titulo, 0, 0, 2, 1);
        grid.add(new Label("Nombre:"), 0, 1);
        grid.add(txtNombre, 1, 1);
        grid.add(new Label("Edad:"), 0, 2);
        grid.add(txtEdad, 1, 2);
        grid.add(new Label("Tipo:"), 0, 3);
        grid.add(comboTipo, 1, 3);
        grid.add(btnCrear, 1, 4);
        grid.add(lblResultado, 0, 5, 2, 1);

        btnCrear.setOnAction(e -> {
            String nombre = txtNombre.getText();
            String edad = txtEdad.getText();
            String tipo = comboTipo.getValue();


            lblResultado.getStyleClass().removeAll("valid", "error");
            lblResultado.setStyle("");
            grid.getStyleClass().remove("valid");

            if (nombre.isEmpty() || edad.isEmpty() || tipo == null) {
                lblResultado.setText("Por favor, llena todos los campos.");
                lblResultado.getStyleClass().add("error");
            } else {
                lblResultado.setText("Nombre: " + nombre + "\nEdad: " + edad + "\nRol: " + tipo);
                lblResultado.getStyleClass().add("valid");
                grid.getStyleClass().add("valid");
            }
        });





        Scene scene = new Scene(grid, 600, 600);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/mx/edu/utez/testfx2/styles.css")).toExternalForm());

        stage.setTitle("Formulario");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
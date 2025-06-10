package mx.edu.utez.testfx2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML private TextField nameField;
    @FXML private TextField ageField;
    @FXML private ComboBox<String> roleComboBox;
    @FXML private PasswordField passwordField;
    @FXML private Button createBtn;
    @FXML private Label resultLabel;

    @FXML
    public void initialize() {

        ObservableList<String> roles = FXCollections.observableArrayList("Estudiante", "Profesor", "Admin");
        roleComboBox.setItems(roles);

        createBtn.setOnAction(e -> handleCreate());
    }

    private void handleCreate() {
        String nombre = nameField.getText();
        String edad = ageField.getText();
        String seleccion = roleComboBox.getSelectionModel().getSelectedItem();

        if (nombre.isEmpty() || edad.isEmpty() || seleccion == null) {
            resultLabel.setText("Todos los campos son obligatorios");
        } else {
            resultLabel.setText("Nombre: " + nombre + "\nEdad: " + edad + "\nRol: " + seleccion);
        }
    }
}

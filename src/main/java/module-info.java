module mx.edu.utez.testfx2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens mx.edu.utez.testfx2 to javafx.fxml;
    exports mx.edu.utez.testfx2;
}
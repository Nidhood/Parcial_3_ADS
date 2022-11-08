module com.javeriana.aplicacionhostal.Controlador {
    requires javafx.controls;
    requires javafx.fxml;
    opens com.javeriana.aplicacionhostal.controlador to javafx.fxml;
    exports com.javeriana.aplicacionhostal.controlador;
}
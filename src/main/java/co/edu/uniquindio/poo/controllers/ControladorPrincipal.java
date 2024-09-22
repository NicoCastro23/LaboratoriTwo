package co.edu.uniquindio.poo.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class ControladorPrincipal {

    @FXML
    private Label labelSaludo;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private void initialize() {
        // Este método se llama automáticamente después de cargar el FXML
        // No es necesario establecer el texto de labelSaludo aquí porque se carga desde el FXML
    }

    @FXML
    private void accionBoton() {
        // Crear una alerta de información
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(resources.getString("titulo"));
        alerta.setHeaderText(null);
        alerta.setContentText(resources.getString("mensajeAlerta"));
        alerta.showAndWait();
    }
}

package co.edu.uniquindio.poo;

import javafx.application.Application;
    import javafx.fxml.FXMLLoader;
    import javafx.scene.Scene;
    import javafx.stage.Stage;
    
    import java.util.Locale;
    import java.util.ResourceBundle;


/**
 * Clase principal que extiende `Application` para iniciar la aplicación JavaFX.
 * Se encarga de cargar la interfaz gráfica y gestionar
 * la instancia de `GestionDeportes`.
 */    
    
    public class App extends Application {
    
        @Override
        public void start(Stage escenarioPrincipal) throws Exception {
            // Establecer el Locale en español
            Locale locale = new Locale("es", "ES");
            // Cargar el ResourceBundle
            ResourceBundle bundle = ResourceBundle.getBundle("co.edu.uniquindio.poo.properties.MiRecurso_en_US", locale);
    
            // Cargar el archivo FXML y pasar el ResourceBundle
            FXMLLoader cargador = new FXMLLoader(getClass().getResource("views/vista.fxml"), bundle);
            Scene escena = new Scene(cargador.load());
            // Establecer el título de la ventana desde el archivo de propiedades
            escenarioPrincipal.setTitle(bundle.getString("titulo"));
            escenarioPrincipal.setScene(escena);
            escenarioPrincipal.show();
        }
    
        public static void main(String[] args) {
            launch(args);
        }
    }
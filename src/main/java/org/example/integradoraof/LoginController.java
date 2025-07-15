package org.example.integradoraof;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LoginController {

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtContrasena;

    @FXML
    private Label lblMensaje;

    @FXML
    private void handleLogin() {
        String usuario = txtUsuario.getText();
        String contrasena = txtContrasena.getText();

        if (usuario.equals("root") && contrasena.equals("admin123")) {
            lblMensaje.setText("Bienvenido, SuperAdmin.");
            // Aquí puedes cambiar a la siguiente escena más adelante
        } else {
            lblMensaje.setText("Credenciales incorrectas.");
        }
    }
}

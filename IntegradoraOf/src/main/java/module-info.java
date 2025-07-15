module org.example.integradoraof {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.integradoraof to javafx.fxml;
    exports org.example.integradoraof;
}
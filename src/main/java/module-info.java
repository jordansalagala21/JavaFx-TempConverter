module com.example.tempconverter {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.tempconverter to javafx.fxml;
    exports com.example.tempconverter;
}
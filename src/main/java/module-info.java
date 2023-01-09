module com.example.healthcarev1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.healthcarev1 to javafx.fxml;
    exports com.example.healthcarev1;
}
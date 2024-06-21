module oslomet.webprog.data1200eksamen {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens oslomet.webprog.data1200eksamen to javafx.fxml;
    exports oslomet.webprog.data1200eksamen;
}
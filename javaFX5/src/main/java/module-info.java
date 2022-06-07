module com.example.javafx2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.javafx2 to javafx.fxml;
    exports com.example.javafx2;
    exports com.example.javafx2.util;
    opens com.example.javafx2.util to javafx.fxml;
}
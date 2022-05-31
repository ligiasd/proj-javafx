module com.ligianedomingos.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.ligianedomingos.javafx to javafx.fxml;
    exports com.ligianedomingos.javafx;
    exports com.ligianedomingos.javafx.application;
    opens com.ligianedomingos.javafx.application to javafx.fxml;
    exports gui;
    opens gui to javafx.fxml;
    exports com.ligianedomingos.javafx.gui;
    opens com.ligianedomingos.javafx.gui to javafx.fxml;
}
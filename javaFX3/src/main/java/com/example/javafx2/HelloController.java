package com.example.javafx2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class HelloController {
    @FXML
    private Button btMyButton;

    @FXML
    public void onMyButtonClick() {
        Alerts.showAlert("Alert title", "Alert header", "Hello", Alert.AlertType.INFORMATION);
    }
}
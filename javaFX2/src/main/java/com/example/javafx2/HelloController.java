package com.example.javafx2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Button btTest;

    @FXML
    public void onBtTestAction() {
        System.out.println("Hello!");
    }
}
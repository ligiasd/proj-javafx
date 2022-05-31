package com.ligianedomingos.javafx.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ViewController {
    @FXML
    private Button btMyButton;

    @FXML
    public void onMyButtonClick() {
        System.out.println("Hello!");
    }
}
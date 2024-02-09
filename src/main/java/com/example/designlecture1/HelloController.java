package com.example.designlecture1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick () {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void onTestButtonClick (ActionEvent actionEvent) {
        welcomeText.setText("Sample text in Test Button");
    }
}
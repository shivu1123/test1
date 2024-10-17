package org.example.test1shivam;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;



import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {


    public TextField usernameField;
    public PasswordField passwordField;
    public Label messageLabel;
    private int failedAttempts = 0;



    public void handleLogin(ActionEvent actionEvent) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            messageLabel.setText("Please Provide Username or Password");
            return;
        }

        int maxAttempts = 5;
        if (failedAttempts >= maxAttempts) {
            messageLabel.setText("Sorry, Your Account is Locked!!!");
            return;
        }

        String correctUsername = "shivam";
        String correctPassword = "12345";
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            messageLabel.setText("Success!!!");
        } else {
            failedAttempts++;
            messageLabel.setText("Sorry, Invalid Username or Password");
        }

    }
}
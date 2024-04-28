package com.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label output;
    @FXML
    private TextField login;

    @FXML
    private PasswordField password;

    @FXML
    protected void onButtonClick() {
       String value = login.getText();
       String passwordValue = password.getText();
       String log = "Вася";
       String pass = "123";
       String str = "";

       if (value.length() == 0 || passwordValue.length() == 0)
        {

            output.setText("Введите логин и пароль!");
        }
        if (value.equals(log) && passwordValue.equals(pass))
        {
            output.setText("Добро пожаловать!");
        }
        else if (!(value.equals(log) && passwordValue.equals(pass)) || value.equals(str) || passwordValue.equals(str))
        {
            if (!(value.equals(log) && passwordValue.equals(pass)))
            {
                output.setText("Неверный логин или пароль!");
            }
            else if (value.equals(str) || passwordValue.equals(str))
            {

                output.setText("Введите логин и пароль!");
            }

        }
    }
}
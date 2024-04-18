package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    // Template code from IntelliJ:
    @FXML
    private Label welcomeText, result;

    @FXML
    private TextField Temperature;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Temperature Converter!");
    }

    @FXML
    protected void onConvertButtonClick() {
        //System.out.println("Project-JavaFX");

        /*
        Integer.parseInt();
        Double.parseDouble();
        */
        String TempInput = Temperature.getText();

        //System.out.println("your temperature is: "+TempInput);

        result.setText(TempInput);

//        Fhn = (Cls * 1.8) + 32
//        double Fahreinheit = (Double.parseDouble(TempInput) * 1.8 )+ 32;
        double Fahreinheit = TempConversion.convertCLStoFHN(Double.parseDouble(TempInput));
        result.setText(String.valueOf(Fahreinheit));
    }
}
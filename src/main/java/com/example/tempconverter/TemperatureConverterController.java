package com.example.tempconverter;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TemperatureConverterController {
    @FXML
    private TextField inputField;

    @FXML
    private ComboBox<String> scaleComboBox;

    @FXML
    private Label resultLabel;  // Corrected from resultLable to resultLabel

    @FXML
    private void convertTemperature() {
        try {
            double inputTemp = Double.parseDouble(inputField.getText());
            String scale = scaleComboBox.getValue();

            double resultTemp;
            if ("Celsius to Fahrenheit".equals(scale)) {  // Corrected string comparison
                resultTemp = inputTemp * 9 / 5 + 32;
                resultLabel.setText(String.format("%.2f °F", resultTemp));
            } else if ("Fahrenheit to Celsius".equals(scale)) {  // Corrected string comparison
                resultTemp = (inputTemp - 32) * 5 / 9;
                resultLabel.setText(String.format("%.2f °C", resultTemp));
            } else {
                resultLabel.setText("Select a conversion scale");
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Please enter a valid temperature");
        }
    }
}

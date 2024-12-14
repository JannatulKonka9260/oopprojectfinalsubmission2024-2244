package com.example.gozyaan;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class DisocuntAndCommissionController
{


    @javafx.fxml.FXML
    private Label commissionLabel;
    @javafx.fxml.FXML
    private Label discountLabel;
    @javafx.fxml.FXML
    private TextField commissionField;
    @javafx.fxml.FXML
    private TextField discountField;

    @javafx.fxml.FXML
    public void backonclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"AdminDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void setDisocountButtonClick(ActionEvent actionEvent) {
        String discountInput = discountField.getText();
            discountLabel.setText("Discount: " + discountInput + "%");
    }

    @javafx.fxml.FXML
    public void setCommissionButtonClick(ActionEvent actionEvent) {
        String commissionInput = commissionField.getText();
        commissionLabel.setText("Commission: " + commissionInput + "%");
    }
}
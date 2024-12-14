package com.example.gozyaan;

import javafx.event.ActionEvent;

import java.io.IOException;

public class SupplierPaymentController
{


    @javafx.fxml.FXML
    public void BackButtononclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"AccountOfficerDashboard.fxml");
    }
}
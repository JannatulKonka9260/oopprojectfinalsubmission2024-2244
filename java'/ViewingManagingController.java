package com.example.gozyaan;

import javafx.event.ActionEvent;

import java.awt.*;
import java.io.IOException;

public class ViewingManagingController
{
    @javafx.fxml.FXML
    private Button Buttononclick;



    @javafx.fxml.FXML
    public void buttononclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"PassengerDashboard.fxml");
    }
}
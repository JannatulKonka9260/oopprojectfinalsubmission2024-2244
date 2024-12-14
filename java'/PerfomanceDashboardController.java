package com.example.gozyaan;

import javafx.event.ActionEvent;

import java.io.IOException;

public class PerfomanceDashboardController
{


    @javafx.fxml.FXML
    public void backbuttononclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"AdminDashboard.fxml");
    }
}
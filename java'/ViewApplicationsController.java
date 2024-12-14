package com.example.gozyaan;

import javafx.event.ActionEvent;

import java.io.IOException;

public class ViewApplicationsController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void Bckonclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"AdminDashboard.fxml");
    }
}
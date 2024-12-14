package com.example.gozyaan;

import javafx.event.ActionEvent;

import java.io.IOException;

public class AdminDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackButttonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"hello-view.fxml");
    }

    @javafx.fxml.FXML
    public void controuseronclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"ViewPassengers.fxml");
    }

    @javafx.fxml.FXML
    public void controlvendoronclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"ContactRenewals.fxml");
    }

    @javafx.fxml.FXML
    public void comminsionrateonclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"DisocuntAndCommission.fxml");
    }

    @javafx.fxml.FXML
    public void Trackonclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"PerfomanceDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void viewapplicationonclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"ViewApplications.fxml");
    }

    @javafx.fxml.FXML
    public void superviseonclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"SecurityPolicy.fxml");
    }

    @javafx.fxml.FXML
    public void serioudonclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"Complains.fxml");
    }

    @javafx.fxml.FXML
    public void acceptdenonclick(ActionEvent actionEvent) {
    }
}
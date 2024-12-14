package com.example.gozyaan;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class ManageExpensesController
{

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void BackButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"AccountOfficerDashboard.fxml");
    }
}
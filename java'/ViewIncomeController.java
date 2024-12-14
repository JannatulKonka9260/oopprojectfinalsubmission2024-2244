package com.example.gozyaan;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class ViewIncomeController {

    @javafx.fxml.FXML
    private TableColumn<Income, String> incomeColumn;
    @javafx.fxml.FXML
    private TableColumn<Income, String> monthColumn;
    @javafx.fxml.FXML
    private TableView<Income> incomeTable;

    private ObservableList<Income> incomeList;

    @javafx.fxml.FXML
    public void initialize() {

        monthColumn.setCellValueFactory(new PropertyValueFactory<>("month"));
        incomeColumn.setCellValueFactory(new PropertyValueFactory<>("income"));


        incomeList = FXCollections.observableArrayList(
                new Income("January", "5000 taka"),
                new Income("February", "5200 taka"),
                new Income("March", "5400 taka"),
                new Income("April", "5600 taka"),
                new Income("May", "5800 taka")
        );


        incomeTable.setItems(incomeList);
    }

    @javafx.fxml.FXML
    public void BackButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "AccountOfficerDashboard.fxml");
    }
}
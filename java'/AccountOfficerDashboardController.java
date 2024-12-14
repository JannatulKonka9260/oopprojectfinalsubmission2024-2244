package com.example.gozyaan;

import javafx.event.ActionEvent;

import java.io.IOException;

public class AccountOfficerDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackButttonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"hello-view.fxml");
    }

    @javafx.fxml.FXML
    public void ManageExpensesButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"ManageExpenses.fxml");
    }

    @javafx.fxml.FXML
    public void financialreportonclick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void Paymentonclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"SupplierPayment.fxml");
    }

    @javafx.fxml.FXML
    public void Monitorfundonclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"ViewIncome.fxml");
    }

    @javafx.fxml.FXML
    public void sendInvoiceonclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"SendInvoice.fxml");
    }

    @javafx.fxml.FXML
    public void viewbudgetissueonclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"Budgets.fxml");
    }

    @javafx.fxml.FXML
    public void taxregonclick(ActionEvent actionEvent) {
    }


    @javafx.fxml.FXML
    public void BillsButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"Bills.fxml");
    }
}
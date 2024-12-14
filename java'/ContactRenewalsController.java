package com.example.gozyaan;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;

import java.io.IOException;

public class ContactRenewalsController {

    @javafx.fxml.FXML
    private ComboBox<String> comboBox;

    @javafx.fxml.FXML
    public void initialize() {

        comboBox.getItems().addAll(
                "Renew Contract for Vendor A",
                "Renew Contract for Vendor B",
                "Renew Contract for Vendor C",
                "Renew Contract for Vendor D"
        );

        comboBox.setPromptText("Select a contract to renew");
    }

    @javafx.fxml.FXML
    public void backonclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "AdminDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void SendButtonOnClick(ActionEvent actionEvent) {
        String selectedContract = comboBox.getValue();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Send Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("Contract renewal request sent for: " + selectedContract);
        alert.showAndWait();
    }
}

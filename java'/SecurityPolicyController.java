package com.example.gozyaan;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SecurityPolicyController
{
    @javafx.fxml.FXML
    private TextArea textArea;

    @javafx.fxml.FXML
    public void initialize() {
        String filePath = getClass().getResource("SecurityPolicy.txt").getPath();
        File selectedFile = new File(filePath);

        StringBuilder outputStr = new StringBuilder();


        try (Scanner sc = new Scanner(selectedFile)) {
            while (sc.hasNextLine()) {
                outputStr.append(sc.nextLine()).append("\n");
            }

            textArea.setText(outputStr.toString());
        } catch (IOException e) {
            textArea.setText("Error reading the file.");
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void backonclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"AdminDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void UpdateButtonOnClick(ActionEvent actionEvent) {
        String filePath = getClass().getResource("SecurityPolicy.txt").getPath();
        File selectedFile = new File(filePath);

        try (FileWriter writer = new FileWriter(selectedFile)) {
            writer.write(textArea.getText());
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Selection Confirmation");
            alert.setHeaderText("Successfully Updated");
            alert.setContentText("Successfully Updated");
            alert.showAndWait();
        } catch (IOException e) {
            textArea.setText("Error updating the file.");
            e.printStackTrace();
        }

    }
}
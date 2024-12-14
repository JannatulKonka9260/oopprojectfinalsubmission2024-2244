package com.example.gozyaan;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BudgetsController
{
    @javafx.fxml.FXML
    private TextArea textArea;

    @javafx.fxml.FXML
    public void initialize() {
        String filePath = getClass().getResource("Budgets.txt").getPath();
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
    public void Backonclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"AccountOfficerDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void SendButtonOnclick(ActionEvent actionEvent) {
        textArea.setText(null);
    }
}
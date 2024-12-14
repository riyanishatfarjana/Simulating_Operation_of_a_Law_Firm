package com.example.group16.Farjana_2220804.FirmManager1;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AssigntaskController {

    @javafx.fxml.FXML
    private TextField Task2fxid;
    @javafx.fxml.FXML
    private TextField Task1fxid;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SaveOnMouseclick(ActionEvent actionEvent) {
        String task1 = Task1fxid.getText();
        String task2 = Task2fxid.getText();

        if (task1.isEmpty() && task2.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("No Tasks Entered");
            alert.setContentText("Please enter at least one task before saving.");
            alert.showAndWait();
            return;
        }

        String fileName = "tasks.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            if (!task1.isEmpty()) {
                writer.write("Task 1: " + task1);
                writer.newLine();
            }
            if (!task2.isEmpty()) {
                writer.write("Task 2: " + task2);
                writer.newLine();
            }
            writer.write("-------------------------------");
            writer.newLine();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText("Tasks Saved");
            alert.setContentText("Your tasks have been successfully saved.");
            alert.showAndWait();
        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("File Error");
            alert.setContentText("An error occurred while saving the tasks. Please try again.");
            alert.showAndWait();
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void BackOnMouseClick(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group16/Farjana_2220804/FirmManager1/Dashboard.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

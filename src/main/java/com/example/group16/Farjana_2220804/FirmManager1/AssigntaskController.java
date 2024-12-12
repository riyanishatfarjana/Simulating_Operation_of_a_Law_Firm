package com.example.group16.Farjana_2220804.FirmManager1;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AssigntaskController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void Task2FXID(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void Task1FXID(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SaveOnMouseclick(ActionEvent actionEvent) {
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
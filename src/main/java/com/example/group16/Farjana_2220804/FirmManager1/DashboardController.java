package com.example.group16.Farjana_2220804.FirmManager1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardController {
    private Stage stage;
    private Scene scene;
    private Parent root;


    @javafx.fxml.FXML
    public void AddNewEmployeeOnMouseClick(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group16/Farjana_2220804/FirmManager1/AddNewEmployee.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void DeleteEmployeeOnMouseClick(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void AssignTaskOnMouseClick(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group16/Farjana_2220804/FirmManager1/AssignTask.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void ShowLawyerOnMouseClick(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group16/Farjana_2220804/FirmManager1/ShowLawyer.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void LogOutOnMouseClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void LeaveRequestOnMouseClick(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group16/Farjana_2220804/FirmManager1/LeaveRequest.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void Button1onMouseClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void Button2OnMouseClick(ActionEvent actionEvent) {
    }
}

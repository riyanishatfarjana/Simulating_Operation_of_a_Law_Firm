package com.example.group16.Farjana_2220804.FirmManager1;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LeaveRequestController
{
    @javafx.fxml.FXML
    private DatePicker datePickerfxid2;
    @javafx.fxml.FXML
    private DatePicker datePickerfxid1;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButtonOnMouseClick(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group16/Farjana_2220804/FirmManager1/Dashboard.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void saveButtonOnMouseClick(ActionEvent actionEvent) {
        LocalDate startDate = datePickerfxid1.getValue();
        LocalDate endDate = datePickerfxid2.getValue();

        if (startDate == null || endDate == null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Date Selection Error");
            alert.setContentText("Please select both start and end dates");
            alert.showAndWait();
        } else if (startDate.isAfter(endDate)){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Invalid Date Range");
            alert.setContentText("Start date cannot be after the end date");
            alert.showAndWait();
        }else{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String formattedStartDate = startDate.format(formatter);
            String formattedEndDate = endDate.format(formatter);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Leave Request Submitted");
            alert.setHeaderText("Leave Request Details");
            alert.setContentText("The person will be absent from"+ formattedStartDate +" to " + formattedEndDate + ".");
            alert.showAndWait();
        }



    }
}

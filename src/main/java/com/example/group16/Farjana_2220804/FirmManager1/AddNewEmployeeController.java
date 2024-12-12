package com.example.group16.Farjana_2220804.FirmManager1;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AddNewEmployeeController {
    @javafx.fxml.FXML
    private TextField idFxIID;
    @javafx.fxml.FXML
    private TextField emailFXID;
    @javafx.fxml.FXML
    private TextField PNFXID;
    @javafx.fxml.FXML
    private TextField NamefxID;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackonMouseClick(ActionEvent actionEvent) {
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
    public void SaveOnMouseClick(ActionEvent actionEvent) {
        String id = idFxIID.getText();
        String email = emailFXID.getText();
        String phoneNumber = PNFXID.getText();
        String name = NamefxID.getText();

        if (id.isEmpty() || email.isEmpty() || phoneNumber.isEmpty() || name.isEmpty()) {
            showAlert("Error", "All fields are required!", Alert.AlertType.ERROR);
            return;
        }

        Employee employee = new Employee(id, name, email, phoneNumber);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.bin", true))) {
            oos.writeObject(employee);
            showAlert("Success", "Employee saved successfully!", Alert.AlertType.INFORMATION);
            clearFields();
        } catch (IOException e) {
            e.printStackTrace();
            showAlert("Error", "Failed to save employee!", Alert.AlertType.ERROR);
        }
    }

    private void clearFields() {
        idFxIID.clear();
        emailFXID.clear();
        PNFXID.clear();
        NamefxID.clear();
    }

    private void showAlert(String title, String content, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.showAndWait();
    }
    }
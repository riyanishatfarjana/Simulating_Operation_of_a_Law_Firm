package com.example.group16.Farjana_2220804.FirmManager1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ShowLawyerController {
    @javafx.fxml.FXML
    private TableView<Employee> tableviewfxID;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> NameFXID;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> PhoneNumberFXID;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> EmailFXID;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> IDFXID;

    @javafx.fxml.FXML
    public void initialize() {
        IDFXID.setCellValueFactory(new PropertyValueFactory<>("id"));
        NameFXID.setCellValueFactory(new PropertyValueFactory<>("name"));
        EmailFXID.setCellValueFactory(new PropertyValueFactory<>("email"));
        PhoneNumberFXID.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        tableviewfxID.setItems(loadEmployees());
    }

    @javafx.fxml.FXML
    public void BackButtonOnMouseClick(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group16/Farjana_2220804/FirmManager1/Dashboard.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ObservableList<Employee> loadEmployees() {
        ObservableList<Employee> employees = FXCollections.observableArrayList();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.bin"))) {
            while (true) {
                Employee employee = (Employee) ois.readObject();
                employees.add(employee);
            }
        } catch (IOException | ClassNotFoundException ignored) {

        }
        return employees;
    }
}

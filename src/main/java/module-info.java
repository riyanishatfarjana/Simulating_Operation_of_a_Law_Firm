module com.example.group16 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.group16 to javafx.fxml;
    exports com.example.group16;
}
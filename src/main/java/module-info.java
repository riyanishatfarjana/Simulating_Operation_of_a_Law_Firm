module com.example.group16 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.group16 to javafx.fxml;
    exports com.example.group16;
    opens com.example.group16.ASHATIT_2220852.user_1 to javafx.fxml;
    exports com.example.group16.ASHATIT_2220852.user_1;
    opens com.example.group16.ASHATIT_2220852.USER2 to javafx.fxml;
    exports com.example.group16.ASHATIT_2220852.USER2;
    opens com.example.group16.Farjana_2220804.FirmManager1 to javafx.fxml;
    exports com.example.group16.Farjana_2220804.FirmManager1;
    opens com.example.group16.Farjana_2220804.Lawyer to javafx.fxml;
    exports com.example.group16.Farjana_2220804.Lawyer;
}
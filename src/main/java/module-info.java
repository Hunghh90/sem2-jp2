module com.example.hunghhsem2jp2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hunghhsem2jp2 to javafx.fxml;
    exports com.example.hunghhsem2jp2;
}
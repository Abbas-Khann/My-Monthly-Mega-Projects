module com.example.emailapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.emailapp to javafx.fxml;
    exports com.example.emailapp;
}
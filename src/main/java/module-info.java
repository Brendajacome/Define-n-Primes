module com.example.definenumbersprimes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.definenumbersprimes to javafx.fxml;
    exports com.example.definenumbersprimes;
}
module com.example.darklogin {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.darklogin to javafx.fxml;
    exports com.example.darklogin;
}
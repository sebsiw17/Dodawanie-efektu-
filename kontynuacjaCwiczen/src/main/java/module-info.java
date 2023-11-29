module com.example.kontynuacjacwiczen {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kontynuacjacwiczen to javafx.fxml;
    exports com.example.kontynuacjacwiczen;
}
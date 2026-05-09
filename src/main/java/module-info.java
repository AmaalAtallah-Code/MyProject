module com.amaal.myproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.amaal.myproject to javafx.fxml;
    exports com.amaal.myproject;
}
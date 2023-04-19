module com.example.w16_teamcity_setup_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.w16_teamcity_setup_javafx to javafx.fxml;
    exports com.example.w16_teamcity_setup_javafx;
}
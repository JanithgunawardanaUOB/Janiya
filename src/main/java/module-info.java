module com.mycompany.cis_service_ticket {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.cis_service_ticket to javafx.fxml;
    exports com.mycompany.cis_service_ticket;
}

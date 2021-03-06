package com.mycompany.cis_service_ticket;

import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class SecondaryController {
ObservableList<String> options = 
    FXCollections.observableArrayList(
        "Option 1",
        "Option 2",
        "Option 3"
    );
final ComboBox comboBox = new ComboBox(options);
    @FXML
    private Button secondaryButton;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}
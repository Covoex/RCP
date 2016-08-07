package com.rps.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import static com.rps.Function.showScene;
import static com.rps.Main.*;

public class MainMenuController {

    @FXML
    private void handleStartBtn(ActionEvent event) throws Exception {
        showScene(chooseMenu);
    }

    @FXML
    private void handleEndBtn() {
        primaryStage.close();
    }

    @FXML
    private void handleSettingsBtn() {
        showScene(settingsMenu);
    }

    @FXML
    private void handleAboutBtn(ActionEvent event) throws Exception {
        showScene(aboutMenu);
    }
}

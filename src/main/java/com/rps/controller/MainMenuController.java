package com.rps.controller;

import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import static com.rps.Function.showScene;
import static com.rps.Main.*;

public class MainMenuController {

    @FXML
    private void handleStartBtn() {
        showScene(chooseMenu);
    }

    @FXML
    private void handleStartBtnKey(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            handleStartBtn();
        }
    }

    @FXML
    private void handleEndBtn() {
        primaryStage.close();
    }

    @FXML
    private void handleEndBtnKey(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            handleEndBtn();
        }
    }

    @FXML
    private void handleSettingsBtn() {
        showScene(settingsMenu);
    }

    @FXML
    private void handleSettingsBtnKey(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            handleSettingsBtn();
        }
    }

    @FXML
    private void handleAboutBtn() {
        showScene(aboutMenu);
    }

    @FXML
    private void handleAboutBtnKey(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            handleAboutBtn();
        }
    }
}

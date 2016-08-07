package com.rps.controller;

import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import static com.rps.Function.showScene;
import static com.rps.Main.mainMenu;

public class AboutMenuController {

    @FXML
    private void handleAboutBackBtn() {
        showScene(mainMenu);
    }


    @FXML
    private void handleAboutBackBtnKey(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            handleAboutBackBtn();
        }
    }
}

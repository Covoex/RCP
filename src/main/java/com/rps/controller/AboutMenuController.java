package com.rps.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import static com.rps.Function.showScene;
import static com.rps.Main.mainMenu;

public class AboutMenuController {
    @FXML
    private void handleAboutBackBtn(ActionEvent event) throws Exception {
        showScene(mainMenu);
    }
}

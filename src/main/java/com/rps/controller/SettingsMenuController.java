package com.rps.controller;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import static com.rps.Function.showScene;
import static com.rps.Main.mainMenu;

public class SettingsMenuController {
    static boolean soundValue = false;

    @FXML
    private ImageView soundImage;

    @FXML
    private void handleBackBtn() {
        showScene(mainMenu);
    }

    @FXML
    private void handleBackBtnKey(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            handleBackBtn();
        }
    }

    @FXML
    private void handleSoundBtn() {
        if (soundValue) {
            soundImage.setImage(new Image("/images/soundOff.png"));
        } else {
            soundImage.setImage(new Image("/images/soundOn.png"));
        }
        soundValue = !soundValue;
    }

    @FXML
    private void handleSoundBtnKey(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            handleSoundBtn();
        }
    }
}

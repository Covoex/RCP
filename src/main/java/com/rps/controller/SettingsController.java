package com.rps.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import static com.rps.Function.showScene;
import static com.rps.Main.mainMenu;

public class SettingsController {

    static boolean soundValue = false;

    @FXML
    private ImageView soundImage;

    @FXML
    private void handleBackBtn(ActionEvent event) throws Exception {
        showScene(mainMenu);
    }

    @FXML
    private void handleSoundBtn(ActionEvent event) throws Exception {
        if (soundValue) {
            soundImage.setImage(new Image("/images/soundOff.png"));
        } else {
            soundImage.setImage(new Image("/images/soundOn.png"));
        }
        soundValue = !soundValue;
    }
}

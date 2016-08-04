package com.rps.controller;

import com.rps.Function;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import static com.rps.Function.*;
import static com.rps.Main.chooseMenu;
import static com.rps.Main.primaryStage;

public class ResultMenuController {


    @FXML
    public ImageView userImage;

    @FXML
    public ImageView computerImage;

    @FXML
    public Label resultLabel;

    @FXML
    public Label statisticsLabel;

    @FXML
    private void handleContinueBtn(ActionEvent event) throws Exception {
        showScene(chooseMenu);
    }

    @FXML
    private void handleEndBtn() {
        primaryStage.close();
    }

    void playInput(int userHandType) {
        int computerHandType = (int) (Math.random() * 3) + 1;
        int result = userHandType - computerHandType;
        userImage.setImage(getImageHandType(userHandType));
        computerImage.setImage(getImageHandType(computerHandType));
        if (result == -1 || result == 2) {
            resultLabel.setText("You Win!!");
            Media sound = new Media(this.getClass().getResource("/sounds/win.wav").toExternalForm());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.play();
            Function.winCount++;
            statistics();
        } else if (result == 0) {
            resultLabel.setText("Draw;;");
            Media sound = new Media(this.getClass().getResource("/sounds/draw.wav").toExternalForm());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.play();
            Function.drawCount++;
            statistics();
        } else {
            resultLabel.setText("You Lose..");
            Media sound = new Media(this.getClass().getResource("/sounds/lose.wav").toExternalForm());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.play();
            loseCount++;
            statistics();
        }
    }
    
    void statistics() {
        statisticsLabel.setText(
                "Win: " + winCount + " Draw: " + drawCount + " Lose: " + loseCount);
    }
}

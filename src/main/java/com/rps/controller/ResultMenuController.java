package com.rps.controller;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import static com.rps.Function.*;
import static com.rps.Main.chooseMenu;
import static com.rps.Main.primaryStage;
import static com.rps.controller.SettingsController.soundValue;

public class ResultMenuController {
    @FXML
    public ImageView userImage;

    @FXML
    public ImageView computerImage;

    @FXML
    public Label resultLabel;
    Media winSound = new Media(this.getClass().getResource("/sounds/win.wav").toExternalForm());
    Media drawSound = new Media(this.getClass().getResource("/sounds/draw.wav").toExternalForm());
    Media loseSound = new Media(this.getClass().getResource("/sounds/lose.wav").toExternalForm());
    @FXML
    private PieChart pieChart;

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
            if (soundValue) {
                MediaPlayer mediaPlayer = new MediaPlayer(winSound);
                mediaPlayer.play();
            }
            winCount++;
        } else if (result == 0) {
            resultLabel.setText("Draw;;");
            if (soundValue) {
                MediaPlayer mediaPlayer = new MediaPlayer(winSound);
                mediaPlayer.play();
            }
            drawCount++;
        } else {
            resultLabel.setText("You Lose..");
            if (soundValue) {
                MediaPlayer mediaPlayer = new MediaPlayer(winSound);
                mediaPlayer.play();
            }
            loseCount++;
        }
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Win", winCount),
                        new PieChart.Data("Draw", drawCount),
                        new PieChart.Data("Lose", loseCount)
                );
        pieChart.setTitle("Statistics");
        pieChart.setData(pieChartData);
        pieChartData.forEach(data ->
                data.nameProperty().bind(
                        Bindings.concat(
                                data.getName(), " ", (int) data.getPieValue()
                        )
                )
        );
    }
}

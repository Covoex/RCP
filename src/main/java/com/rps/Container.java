package com.rps;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class Container {
    private static int loseCount;
    private static int winCount;
    private static int drawCount;

    @FXML private Button startBtn;
    @FXML private Button endBtn;
    @FXML private Button backBtn;
    @FXML private Button continueBtn;
    @FXML private Button endBtnBack;
    @FXML
    private ImageView userImage;
    @FXML
    private ImageView computerImage;
    @FXML
    private Label resultLabel;
    @FXML private Button rockBtn;
    @FXML private Button paperBtn;
    @FXML private Button scissorsBtn;
    @FXML
    private Label statisticsLabel;

    public void mainMenu(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/menu_main.fxml"));
        Stage stage = (Stage) backBtn.getScene().getWindow();
        stage.setScene(new Scene(root, 600, 500));
        stage.show();
    }

    public void chooseMenu(ActionEvent event) throws Exception {
        winCount = 0;
        loseCount = 0;
        drawCount = 0;
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/menu_choose.fxml"));
        Stage stage = (Stage) startBtn.getScene().getWindow();
        stage.setScene(new Scene(root, 600, 500));
        stage.show();
    }

    public void chooseMenuBack(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/menu_choose.fxml"));
        Stage stage = (Stage) continueBtn.getScene().getWindow();
        stage.setScene(new Scene(root, 600, 500));
        stage.show();
    }

    public void endBtnBack(ActionEvent event) throws Exception {
        Stage stage = (Stage) endBtnBack.getScene().getWindow();
        stage.close();
    }

    public void endGame() {
        Stage stage = (Stage) endBtn.getScene().getWindow();
        stage.close();
    }

    public void rock(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/menu_result.fxml"));
        Parent root = loader.load();
        Container container = loader.getController();
        container.playInput(1);
        rockBtn.getScene().setRoot(root);
    }

    public void paper(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/menu_result.fxml"));
        Parent root = loader.load();
        Container container = loader.getController();
        container.playInput(3);
        paperBtn.getScene().setRoot(root);
    }

    public void scissors(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/menu_result.fxml"));
        Parent root = loader.load();
        Container container = loader.getController();
        container.playInput(2);
        scissorsBtn.getScene().setRoot(root);
    }

    private Image getImageHandType(int handType) {
        switch(handType) {
            case 1:
                return new Image("/images/rock.png");
            case 2:
                return new Image("/images/scissors.png");
            case 3:
                return new Image("/images/paper.png");
        }
        return new Image("");
    }
    public void statistics() {
        statisticsLabel.setText(
            "Win: " + winCount + " Draw: " + drawCount + " Lose: " + loseCount);
    }

    private void playInput(int userHandType) {
        int computerHandType = (int) (Math.random() * 3) + 1;
        int result = userHandType - computerHandType;
        userImage.setImage(getImageHandType(userHandType));
        computerImage.setImage(getImageHandType(computerHandType));
        if (result == -1 || result == 2) {
            resultLabel.setText("You Win!!");
            Media sound = new Media(this.getClass().getResource("/sounds/win.wav").toExternalForm());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.play();
            winCount++;
            statistics();
        } else if (result == 0) {
            resultLabel.setText("Draw;;");
            Media sound = new Media(this.getClass().getResource("/sounds/draw.wav").toExternalForm());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.play();
            drawCount++;
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
}
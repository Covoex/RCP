package com.rps;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class container {
    private static int loseCount;
    private static int winCount;
    private static int drawCount;

    @FXML private Button startBtn;
    @FXML private Button endBtn;
    @FXML private Button backBtn;
    @FXML private Button continueBtn;
    @FXML private Button endBtnBack;
    @FXML private TextField userStringHandType;
    @FXML private TextField computerStringHandType;
    @FXML private TextField resultTextField;
    @FXML private Button rockBtn;
    @FXML private Button paperBtn;
    @FXML private Button scissorsBtn;
    @FXML private TextField statisticsTextField;

    public void mainMenu(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));
        Stage stage = (Stage) backBtn.getScene().getWindow();
        stage.setScene(new Scene(root, 400, 300));
        stage.show();
    }

    public void chooseMenu(ActionEvent event) throws Exception {
        winCount = 0;
        loseCount = 0;
        drawCount = 0;
        Parent root = FXMLLoader.load(getClass().getResource("chooseMenu.fxml"));
        Stage stage = (Stage) startBtn.getScene().getWindow();
        stage.setScene(new Scene(root, 400, 300));
        stage.show();
    }

    public void chooseMenuBack(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("chooseMenu.fxml"));
        Stage stage = (Stage) continueBtn.getScene().getWindow();
        stage.setScene(new Scene(root, 400, 300));
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
        FXMLLoader loader = new FXMLLoader(getClass().getResource("resultMenu.fxml"));
        Parent root = loader.load();
        container container = loader.getController();
        container.playInput(1);
        rockBtn.getScene().setRoot(root);
    }

    public void paper(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("resultMenu.fxml"));
        Parent root = loader.load();
        container container = loader.getController();
        container.playInput(3);
        paperBtn.getScene().setRoot(root);
    }

    public void scissors(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("resultMenu.fxml"));
        Parent root = loader.load();
        container container = loader.getController();
        container.playInput(2);
        scissorsBtn.getScene().setRoot(root);
    }

    private String getStringHandType(int handType) {
        switch(handType) {
            case 1:
                return "Rock";
            case 2:
                return "Scissors";
            case 3:
                return "Paper";
        }
        return "";
    }
    public void statistics() {
        statisticsTextField.setText(
            "Win: " + winCount + " Draw: " + drawCount + " Lose: " + loseCount);
    }

    private void playInput(int userHandType) {
        int computerHandType = (int) (Math.random() * 3) + 1;
        int result = userHandType - computerHandType;
        userStringHandType.setText(getStringHandType(userHandType));
        computerStringHandType.setText(getStringHandType(computerHandType));
        if (result == -1 || result == 2) {
            resultTextField.setText("You Win!!");
            winCount++;
            statistics();
        } else if (result == 0) {
            resultTextField.setText("Draw;;");
            drawCount++;
            statistics();
        } else {
            resultTextField.setText("You Lose..");
            loseCount++;
            statistics();
        }
    }
}
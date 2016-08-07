package com.rps.controller;

import com.rps.Function;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import static com.rps.Function.showScene;
import static com.rps.Main.mainMenu;
import static com.rps.Main.primaryStage;

public class ChooseMenuController {

    @FXML
    private void handleRockBtn() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/menu_result.fxml"));
        Parent root = loader.load();
        ResultMenuController controller = loader.getController();
        primaryStage.setMinWidth(1000);
        primaryStage.setMinHeight(900);
        primaryStage.setScene(new Scene(root, 1000, 900));
        controller.playInput(1);
    }

    @FXML
    private void handlePaperBtn() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/menu_result.fxml"));
        Parent root = loader.load();
        ResultMenuController controller = loader.getController();
        primaryStage.setMinWidth(1000);
        primaryStage.setMinHeight(900);
        primaryStage.setScene(new Scene(root, 1000, 900));
        controller.playInput(3);
    }

    @FXML
    private void handleScissorsBtn() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/menu_result.fxml"));
        Parent root = loader.load();
        ResultMenuController controller = loader.getController();
        primaryStage.setMinWidth(1000);
        primaryStage.setMinHeight(900);
        primaryStage.setScene(new Scene(root, 1000, 900));
        controller.playInput(2);
    }

    @FXML
    private void handleBackBtn() {
        Function.winCount = 0;
        Function.loseCount = 0;
        Function.drawCount = 0;
        showScene(mainMenu);
    }

    @FXML
    private void handleBackBtnKey(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            handleBackBtn();
        }
    }
}

package com.rps.controller;

import com.rps.Function;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import static com.rps.Function.showScene;
import static com.rps.Main.mainMenu;
import static com.rps.Main.primaryStage;

public class ChooseMenuController {

    @FXML
    private void handleBackBtn(ActionEvent event) throws Exception {
        Function.winCount = 0;
        Function.loseCount = 0;
        Function.drawCount = 0;
        showScene(mainMenu);
    }

    @FXML
    private void handleRockBtn(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/menu_result.fxml"));
        Parent root = loader.load();
        ResultMenuController controller = loader.getController();
        primaryStage.setScene(new Scene(root, 900, 800));
        controller.playInput(1);
    }

    @FXML
    private void handlePaperBtn(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/menu_result.fxml"));
        Parent root = loader.load();
        ResultMenuController controller = loader.getController();
        primaryStage.setScene(new Scene(root, 900, 800));
        controller.playInput(3);
    }

    @FXML
    private void handleScissorsBtn(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/menu_result.fxml"));
        Parent root = loader.load();
        ResultMenuController controller = loader.getController();
        primaryStage.setScene(new Scene(root, 900, 800));
        controller.playInput(2);
    }
}

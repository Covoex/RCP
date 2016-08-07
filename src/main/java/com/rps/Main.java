package com.rps;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    public static Stage primaryStage;
    public static Scene aboutMenu;
    public static Scene mainMenu;
    public static Scene chooseMenu;
    public static Scene settingsMenu;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        aboutMenu = new Scene(FXMLLoader.load(getClass().getResource("/fxml/menu_about.fxml")), 700, 600);
        mainMenu = new Scene(FXMLLoader.load(getClass().getResource("/fxml/menu_main.fxml")), 700, 600);
        chooseMenu = new Scene(FXMLLoader.load(getClass().getResource("/fxml/menu_choose.fxml")), 700, 600);
        settingsMenu = new Scene(FXMLLoader.load(getClass().getResource("/fxml/menu_settings.fxml")), 700, 600);
        mainMenu.getStylesheets().add(getClass().getResource("/styles/blacktheme.css").toExternalForm());
        aboutMenu.getStylesheets().add(getClass().getResource("/styles/blacktheme.css").toExternalForm());
        chooseMenu.getStylesheets().add(getClass().getResource("/styles/blacktheme.css").toExternalForm());
        settingsMenu.getStylesheets().add(getClass().getResource("/styles/blacktheme.css").toExternalForm());
        primaryStage.setTitle("Rps");
        primaryStage.setScene(mainMenu);
        primaryStage.getIcons().add(new Image("/images/icon.png"));
        primaryStage.setMinWidth(700);
        primaryStage.setMinHeight(600);
        primaryStage.show();
        Main.primaryStage = primaryStage;
    }
}
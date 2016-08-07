package com.rps;

import javafx.scene.Scene;
import javafx.scene.image.Image;

import static com.rps.Main.primaryStage;

public class Function {
    public static int loseCount;
    public static int winCount;
    public static int drawCount;

    public static void showScene(Scene scene) {
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static Image getImageHandType(int handType) {
        switch (handType) {
            case 1:
                return new Image("/images/rock.png");
            case 2:
                return new Image("/images/scissors.png");
            case 3:
                return new Image("/images/paper.png");
        }
        return null;
    }
}

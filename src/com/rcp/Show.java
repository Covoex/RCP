package com.rcp;

/**
 * @author Hyunjae Lee
 */

class Show {

    String showHandType(int hand) {
        String handType = null;
        switch (hand) {
            case 1:
                handType = "Rock";
                break;
            case 2:
                handType = "Scissor";
                break;
            case 3:
                handType = "Paper";
                break;
        }
        return handType;
    }
}

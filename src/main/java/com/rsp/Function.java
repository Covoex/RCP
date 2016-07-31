package com.rsp;

class Function {
    static int loseCount;
    static int winCount;
    static int drawCount;

    static String getStringHandType(int handType) {
        switch (handType) {
            case 1:
                return "Rock";
            case 2:
                return "Scissor";
            case 3:
                return "Paper";
        }
        return "";
    }
}
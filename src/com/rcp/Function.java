package com.rcp;

class Function {
    static int loseCount;
    static int winCount;
    static int drawCount;

    /**
     * @return random number between [1, 3].
     */
    static int getRandomHandType() {
        return (int) (Math.random() * 3) + 1;
    }
    
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
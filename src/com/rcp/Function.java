package com.rcp;

/**
 * @author Myeongjun Kim
 */
class Function {
    static int loseCount;
    static int winCount;
    static int drawCount;

    /**
     * @return get random number between [1, 3].
     */
    static int getRandomHandType() {
        return (int) (Math.random() * 3) + 1;
    }

    /**
     * @param handType number that represents a hand type.
     * @return string hand type of hand type.
     */
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
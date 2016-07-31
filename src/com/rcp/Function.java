package com.rcp;

/**
 * @author Myeongjun Kim
 */
class Function {
    static int loseCount;
    static int winCount;
    static int drawCount;

    /**
     * @return get random number between [1, 3]
     */
    static int getRandomHandType() {
        return (int) (Math.random() * 3) + 1;
    }

    static String getStringHandType(int handType) {
        String stringHandType = null;
        switch (handType) {
            case 1:
                stringHandType = "Rock";
                break;
            case 2:
                stringHandType = "Scissor";
                break;
            case 3:
                stringHandType = "Paper";
                break;
        }
        return stringHandType;
    }
}
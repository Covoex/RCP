package com.rcp;

/**
 * @author Hyunjae Lee
 * @author Myeongjun Kim
 */

class Data {
    private static int COMPUTERWIN;
    private static int USERWIN;
    private static int DRAW;

    static void show() {
        System.out.println();
        System.out.println("[Statistics]");
        System.out.println("Win: " + USERWIN);
        System.out.println("Lose: " + COMPUTERWIN);
        System.out.println("Draw: " + DRAW);
    }

    void input(Winner win) {
        switch (win) {
            case USER:
                ++USERWIN;
                break;
            case COMPUTER:
                ++COMPUTERWIN;
                break;
            case DRAW:
                ++DRAW;
                break;
        }
    }
}

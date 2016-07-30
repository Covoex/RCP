/**
 * @author Hyunjae Lee
 */

class Data {
    private static int COMPUTERWIN;
    private static int USERWIN;
    private static int DRAW;

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

    void show() {
        System.out.println("Win: " + USERWIN);
        System.out.println("Lose: " + COMPUTERWIN);
        System.out.println("Draw: " + DRAW);
    }
}

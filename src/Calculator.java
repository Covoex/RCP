/**
 * @author Hyunjae Lee
 */

class Calculator {
    private int random() {
        return (int) (Math.random() * 3) + 1;
    }

    void judge(int user) {
        Show sh = new Show();
        Data data = new Data();
        Winner win = null;
        int com = random();
        int result = user - com;
        System.out.println("You: " + sh.showHandType(user) + " Computer: " + sh.showHandType(com));
        if (result == -1 || result == 2) {
            win = Winner.USER;
            data.input(Winner.USER);
            System.out.println("You Win!!");
        } else if (result == 0) {
            win = Winner.DRAW;
            data.input(Winner.DRAW);
            System.out.println("Draw;;");
        } else {
            win = Winner.COMPUTER;
            data.input(Winner.COMPUTER);
            System.out.println("You Lose..");
        }
        return;
    }
}

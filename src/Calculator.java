/**
 * @author Hyunjae Lee
 */

class Calculator {
    public int Random() {
        int random = (int) (Math.random() * 3) + 1;
        return random;
    }

    public void Judge(int user) {
        Show sh = new Show();
        DATA data = new DATA();
        Winner win = null;
        int u = user;
        int com = Random();
        int result = u - com;
        System.out.println("You: " + sh.ShowHandType(u) + " Computer: " + sh.ShowHandType(com));
        if (result == -1 || result == 2) {
            win = Winner.USER;
            data.Input(Winner.USER);
            System.out.println("You Win!!");
        } else if (result == 0) {
            win = Winner.DRAW;
            data.Input(Winner.DRAW);
            System.out.println("Draw;;");
        } else {
            win = Winner.COMPUTER;
            data.Input(Winner.COMPUTER);
            System.out.println("You Lose..");
        }
        return;
    }
}

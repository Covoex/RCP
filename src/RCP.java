import java.util.Scanner;

/**
 * RCP
 * Java Rock Scissor Paper Game.
 *
 * @author Hyunjae Lee
 *         <p>
 *         Version 1.0
 *         3/1/14 (D/M/Y)
 */

public class RCP {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****Welcome to the RCP Game*****");
        while (true) {
            try {
                System.out.println("--Select--");
                System.out.println("1.Start Game");
                System.out.println("2.View Result");
                System.out.println("3.End Game");
                System.out.print(">");
                int select1 = sc.nextInt();
                sc.nextLine();
                if (select1 < 0 || select1 > 3) {
                    System.out.println("Wrong Select");
                    System.out.println("Select Again");

                }
                switch (select1) {
                    case 1:
                        Game g = new Game();
                        break;
                    case 2:
                        DATA d = new DATA();
                        d.Show();
                        break;
                    case 3:
                        return;
                }
            } catch (Exception e) {
                System.out.println("Exception occurred");
                break;
            }
        }
    }
}

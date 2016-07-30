import java.util.Scanner;

/**
 * @author Hyunjae Lee
 */

class Game {
    static void game() {
        Scanner sc = new Scanner(System.in);
        Loop1:
        while (true) {
            try {
                System.out.println();
                System.out.println("--Select--");
                System.out.println("[1] Rock");
                System.out.println("[2] Scissor");
                System.out.println("[3] Paper");
                System.out.print(">");
                int select1 = sc.nextInt();
                sc.nextLine();
                if (select1 < 0 || select1 > 3) {
                    System.out.println("Wrong Select");
                    System.out.println("Select Again");
                    continue;
                }
                Calculator calc = new Calculator();
                calc.judge(select1);
                while (true) {
                    System.out.println();
                    System.out.println("--Select--");
                    System.out.println("[1] Continue");
                    System.out.println("[2] Statistics");
                    System.out.println("[3] End game");
                    System.out.print(">");
                    int select2 = sc.nextInt();
                    sc.nextLine();
                    if (select2 < 0 || select2 > 3) {
                        System.out.println("Wrong Select");
                        System.out.println("Select Again");
                        continue;
                    }
                    switch (select2) {
                        case 1:
                            continue Loop1;
                        case 2:
                            Data.show();
                            break;
                        case 3:
                            return;
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception occurred");
                break;
            }
        }
    }
}

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

public class Rcp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("RRRRRRRRRRRRRRRRR           CCCCCCCCCCCCCPPPPPPPPPPPPPPPPP");
        System.out.println("R::::::::::::::::R       CCC::::::::::::CP::::::::::::::::P");
        System.out.println("R::::::RRRRRR:::::R    CC:::::::::::::::CP::::::PPPPPP:::::P");
        System.out.println("RR:::::R     R:::::R  C:::::CCCCCCCC::::CPP:::::P     P:::::P");
        System.out.println("R::::R     R:::::R C:::::C       CCCCCC  P::::P     P:::::P");
        System.out.println("R::::R     R:::::RC:::::C                P::::P     P:::::P");
        System.out.println("R::::RRRRRR:::::R C:::::C                P::::PPPPPP:::::P");
        System.out.println("R:::::::::::::RR  C:::::C                P:::::::::::::PP");
        System.out.println("R::::RRRRRR:::::R C:::::C                P::::PPPPPPPPP");
        System.out.println(" R::::R     R:::::RC:::::C                P::::P");
        System.out.println("R::::R     R:::::RC:::::C                P::::P)");
        System.out.println(" R::::R     R:::::R C:::::C       CCCCCC  P::::P");
        System.out.println("RR:::::R     R:::::R  C:::::CCCCCCCC::::CPP::::::PP");
        System.out.println(" R::::::R     R:::::R   CC:::::::::::::::CP::::::::P");
        System.out.println(" R::::::R     R:::::R     CCC::::::::::::CP::::::::P");
        System.out.println(" RRRRRRRR     RRRRRRR        CCCCCCCCCCCCCPPPPPPPPPP");
        System.out.println();
        System.out.println("RCP game is a Rock Scissors Paper game.");
        System.out.println();
        while (true) {
            try {
                System.out.println("--Select--");
                System.out.println("[1] Start Game");
                System.out.println("[2] End Game");
                System.out.print(">");
                int select1 = sc.nextInt();
                sc.nextLine();
                if (select1 < 0 || select1 > 3) {
                    System.out.println("Wrong Select");
                    System.out.println("Select Again");

                }
                switch (select1) {
                    case 1:
                        Game.game();
                        break;
                    case 2:
                        return;
                }
            } catch (Exception e) {
                System.out.println("Exception occurred");
                break;
            }
        }
    }
}

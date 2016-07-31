package com.rcp;

import static com.rcp.Input.*;

/**
 * @author Myeongjun Kim
 */
class Program {

    static void intro() {
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
    }

    static void mainMenu() {
        System.out.println();
        System.out.println("[Main Menu]");
        System.out.println("[1] Start game");
        System.out.println("[2] End game");
        menuInput();
    }

    static void playMenu() {
        System.out.println();
        System.out.println("[Play Menu]");
        System.out.println("[1] Rock");
        System.out.println("[2] Scissor");
        System.out.println("[3] Paper");
        playInput();
    }

    static void stopMenu() {
        System.out.println();
        System.out.println("[Stop Menu]");
        System.out.println("[1] Continue");
        System.out.println("[2] End game");
        System.out.println("[3] Statistics");
        stopInput();
    }
}
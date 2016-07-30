package com.rcp;

import static com.rcp.Input.input;

/**
 * @author Myeongjun Kim
 */

class Program {

    static void start() {
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

    static void menu() {
        System.out.println();
        System.out.println("--Select--");
        System.out.println("[1] Start game");
        System.out.println("[2] End game");
        input();
    }
}

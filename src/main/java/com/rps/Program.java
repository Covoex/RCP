package com.rps;

import static com.rps.Function.*;
import static com.rps.Input.*;

class Program {

    static void intro() {
        System.out.println("RRRRRRRRRRRRRRRRR   PPPPPPPPPPPPPPPPP      SSSSSSSSSSSSSSS");
        System.out.println("R::::::::::::::::R  P::::::::::::::::P   SS:::::::::::::::S");
        System.out.println("R::::::RRRRRR:::::R P::::::PPPPPP:::::P S:::::SSSSSS::::::S");
        System.out.println(" RR:::::R     R:::::RPP:::::P     P:::::PS:::::S     SSSSSSS");
        System.out.println("  R::::R     R:::::R  P::::P     P:::::PS:::::S");
        System.out.println(" R::::R     R:::::R  P::::P     P:::::PS:::::S");
        System.out.println("  R::::RRRRRR:::::R   P::::PPPPPP:::::P  S::::SSSS");
        System.out.println(" R:::::::::::::RR    P:::::::::::::PP    SS::::::SSSSS");
        System.out.println("  R::::RRRRRR:::::R   P::::PPPPPPPPP        SSS::::::::SS");
        System.out.println("  R::::R     R:::::R  P::::P                   SSSSSS::::S");
        System.out.println("   R::::R     R:::::R  P::::P                        S:::::S");
        System.out.println("R::::R     R:::::R  P::::P                        S:::::S");
        System.out.println("RR:::::R     R:::::RPP::::::PP          SSSSSSS     S:::::S");
        System.out.println(" R::::::R     R:::::RP::::::::P          S::::::SSSSSS:::::S");
        System.out.println("R::::::R     R:::::RP::::::::P          S:::::::::::::::SS");
        System.out.println("RRRRRRRR     RRRRRRRPPPPPPPPPP           SSSSSSSSSSSSSSS");
        System.out.println();
        System.out.println("Rock-paper-scissors game made with java.");
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

    static void statistics() {
        System.out.println();
        System.out.println("[Statistics]");
        System.out.println("Win: " + winCount);
        System.out.println("Lose: " + loseCount);
        System.out.println("Draw: " + drawCount);
    }
}
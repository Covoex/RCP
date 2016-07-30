package com.rcp;

import java.util.Scanner;

/**
 * @author Myeongjun Kim
 */

class Input {

    /**
     * needs optimizing
     */
    static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("> ");
        int inputInt = 0;
        String inputString = sc.nextLine();
        boolean yes = false;

        while (true) {
            while (inputString.isEmpty() || yes) {
                System.out.println();
                System.out.println("Enter [1] or [2]");
                System.out.print("> ");
                inputString = sc.nextLine();
                yes = false;
            }

            try {
                inputInt = Integer.parseInt(inputString);
            } catch (NumberFormatException e) {
                yes = true;
            }
            if (inputInt < 1 || inputInt > 2) {
                yes = true;
            }
            if (!yes) {
                break;
            }
        }

        switch (inputInt) {
            case 1:
                Game.game();
                break;
            case 2:
                break;
        }
    }
}

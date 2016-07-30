package com.rcp;

import java.util.Scanner;

/**
 * @author Myeongjun Kim
 */

class Input {

    static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("> ");
        int inputInt = 0;
        String inputString = sc.nextLine();

        if (inputString.isEmpty()) {
            System.out.println();
            System.out.println("Enter [1] or [2]");
            input();
        } else {
            try {
                inputInt = Integer.parseInt(inputString);
            } catch (NumberFormatException e) {
                System.out.println();
                System.out.println("Enter [1] or [2]");
                input();
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

package edu.ucaldas.poo.cramps;

import java.util.Random;

public class CrapsCopilot {
    private static final Random random = new Random();

    public static void main(String[] args) {
        int point = rollDice();
        int result = checkFirstRoll(point);

        if (result == 0) {
            System.out.println("Point is " + point);
            while (true) {
                int roll = rollDice();
                if (roll == point) {
                    System.out.println("You win by making your point!");
                    break;
                } else if (roll == 7) {
                    System.out.println("You lose by rolling a 7 before making your point.");
                    break;
                }
            }
        } else if (result == 1) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }

    private static int rollDice() {
        int die1 = 1 + random.nextInt(6);
        int die2 = 1 + random.nextInt(6);
        int sum = die1 + die2;
        System.out.println("You rolled " + sum);
        return sum;
    }

    private static int checkFirstRoll(int sum) {
        switch (sum) {
            case 7:
            case 11:
                return 1; // win
            case 2:
            case 3:
            case 12:
                return -1; // lose
            default:
                return 0; // continue
        }
    }
}
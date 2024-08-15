package homeworks;

import java.time.LocalTime;
import java.util.Scanner;

public class HW41 {

    /*
     //41: Write a method that rolls two dice and multiplies the result based on the second the dice are rolled,
     comparing the player's score with the computer's score.
     If the second is a multiple of 5, multiply the dice value by 5 and add to the score.
     If the second is even, multiply the dice value by 2 and add to the score.
     If the second is odd, add the dice value to the score.*/


    public static void main(String[] args) {

        rollDice();

    }

    static int playerScore = 0;
    static int computerScore = 0;
    static int counter = 0;

    public static void rollDice() {

        int playersDice = 0;
        int computerDice = 0;
        int playerSecond = 0;
        int computerSecond = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'R' to roll the dice");

        if (scanner.next().equalsIgnoreCase("r")) {
            playersDice = (int) (Math.random() * 6) + 1;
            System.out.println("playersDice = " + playersDice);
            playerSecond = LocalTime.now().getSecond();
            System.out.println("playerSecond = " + playerSecond);

            if (playerSecond % 5 == 0) {
                playerScore += playersDice * 5;
            } else if (playerSecond % 2 == 0) {
                playerScore += playersDice * 2;
            } else {
                playerScore += playersDice;
            }
        } else {
            rollDice();
        }

        computerDice = (int) (Math.random() * 6) + 1;
        System.out.println("computerDice = " + computerDice);
        computerSecond = LocalTime.now().getSecond() + 1;
        System.out.println("computerSecond = " + computerSecond);

        if (computerSecond % 5 == 0) {
            computerScore += computerDice * 5;
        } else if (computerSecond % 2 == 0) {
            computerScore += computerDice * 2;
        } else {
            computerScore += computerDice;
        }


        counter++;
        if (counter == 2) {
            if (playerScore > computerScore) {
                System.out.println("You win: " + playerScore + "<==>" + computerScore);
            } else if (playerScore < computerScore) {
                System.out.println("Computer win: " + playerScore + "<==>" + computerScore);
            } else {
                System.out.println("It's a tie: " + playerScore + "<==>" + computerScore);
            }
        } else {
            System.out.println("First Roll Scores: "+playerScore + "<==>" + computerScore);
            rollDice();

        }


    }
}

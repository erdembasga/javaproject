package practices.practice05;

import java.util.Scanner;

public class Q03_Arrays_RockPaperScissors {
/*
    Write a Rock-Paper-Scissors game.
    - Get the player's guess.
    - Compare it with the computer's guess.
    - The first to reach 3 wins.
    - Winning by a margin of 3 is a Gold Score, by a margin of 2 is a Silver Score, and by a margin of 1 is a Platinum Score.
*/
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int playersScore = 0;
        int computersScore = 0;

        while (playersScore < 3 && computersScore < 3) {

            System.out.println("Enter Your Choice: \n-Rock\n-Paper\n-Scissors");
            String playersGuess = scanner.next();

            if (!(playersGuess.equalsIgnoreCase("Rock") || playersGuess.equalsIgnoreCase("Paper") || playersGuess.equalsIgnoreCase("Scissors"))) {
                System.out.println("You entered invalid choice");
                continue;
            }

            System.out.println("playersGuess = " + playersGuess);

            int randomIndex = (int) (Math.random() * 3);
            String[] arr = {"Rock", "Paper", "Scissors"};
            String computersGuess = arr[randomIndex];
            System.out.println("computersGuess = " + computersGuess);


            if (playersGuess.equalsIgnoreCase(computersGuess)) {
                System.out.println("It's a tie!! " + playersScore + "--" + computersScore);
            } else if (playersGuess.equalsIgnoreCase("rock") && computersGuess.equals("Scissors") || playersGuess.equalsIgnoreCase("Paper") && computersGuess.equals("Rock") || playersGuess.equalsIgnoreCase("Scissors") && computersGuess.equals("Paper")) {
                playersScore++;
                System.out.println("You won!!! : " + playersScore + "--" + computersScore);
            } else {
                computersScore++;
                System.out.println("Computer won!!! : " + playersScore + "--" + computersScore);
            }

        }

        System.out.println("==GAME OVER==");

        if (playersScore == 3) {
            if (computersScore == 2) {
                System.out.println("You win with Platinum Score!!!");
            } else if (computersScore == 1) {
                System.out.println("You win with Silver Score!!!");
            } else {
                System.out.println("You win with GOLD Score!!!");
            }
        } else {
            if (playersScore == 2) {
                System.out.println("Computer win with Platinum Score!!!");
            } else if (playersScore == 1) {
                System.out.println("Computer win with Silver Score!!!");
            } else {
                System.out.println("Computer win with GOLD Score!!!");
            }
        }

    }
}

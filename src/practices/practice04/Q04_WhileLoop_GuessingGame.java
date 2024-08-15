package practices.practice04;

import java.util.Scanner;

public class Q04_WhileLoop_GuessingGame {
/*
     Write a code that guesses a number between 0 and 100.
     Hint: If the number you entered is smaller than randomNum ==> Enter a larger number.
           If the number you entered is larger than randomNum ==> Enter a smaller number.
           If the number you entered is equal to randomNum ==> Congratulations!!! You guessed the number in ? attempts. Your score: ?
*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a guess number between 1-100");
        int randomNum = (int) (Math.random() * 101);
        int number;
        int counter = 0;

        while (true) {
            counter++;
            number = scanner.nextInt();
            if (number == randomNum) {
                System.out.println("Congratulations!!! You guessed the number in " + counter + ". attempts. Your score: " + (11 - counter) * 10);
                break;
            } else if (number < randomNum) {
                System.out.println("Wrong guess, you have " + (10 - counter) + " more attempts. Enter a larger number.");
            } else {
                System.out.println("Wrong guess, you have " + (10 - counter) + " more attempts. Enter a smaller number.");
            }

            if (counter == 10) {
                System.out.println("You have run out of attempts and lost the game. \nEnter 1 to play again, or any other number to exist the game.");
                int option = scanner.nextInt();
                if (option == 1) {
                    System.out.println("Enter a guess number between 1-100");
                    counter = 0;
                    randomNum = (int) (Math.random() * 101);
                } else {
                    System.out.println("Good Bye!!!");
                    break;
                }
            }
        }
    }
}

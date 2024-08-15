package Deneme;

import java.util.Scanner;

public class D21 {
//21: Write a code that generates a random password with the
// length equal to the number of characters you get from the user.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of characters");

        int numberOfChars = scanner.nextInt();

        String Characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String password = "";

        for (int i = 0; i<= numberOfChars; i++){
            int randomNumber = (int) (Math.random() * Characters.length());
            password += Characters.charAt(randomNumber);
        }

        System.out.println("password = " + password);
    }
}

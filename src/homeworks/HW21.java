package homeworks;

import java.util.Scanner;

public class HW21 {
//21: Write a code that generates a random password with the
// length equal to the number of characters you get from the user.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of characters");
        int numOfChars = scanner.nextInt();

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String password = "";

        for (int i = 0; i<= numOfChars; i++){
            int randomNumber = (int)(Math.random()*characters.length());
            password += characters.charAt(randomNumber);
        }

        System.out.println("password = " + password);

    }

}

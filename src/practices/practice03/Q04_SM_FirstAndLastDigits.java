package practices.practice03;

import java.util.Scanner;

public class Q04_SM_FirstAndLastDigits {

    // Write Java program to calculate the product of the first and last digit of an integer
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        String number = scanner.next();

        int firstDigit = Integer.parseInt(number.substring(0, 1));
        int lastDigit = Integer.parseInt(number.substring(number.length() - 1));

        System.out.println("Product: " + (firstDigit * lastDigit));

    }

}

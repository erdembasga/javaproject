package Deneme;

import java.util.Scanner;

public class D22 {
//22: Write a code that prints consecutive numbers starting from a number
// taken from the user until it reaches a multiple of 10.
// Example: Number: 46 Output: 46, 47, 48, 49

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = scanner.nextInt();

        while (number % 10 != 0){
            System.out.println(number + " ");
            number++;
        }
    }
}

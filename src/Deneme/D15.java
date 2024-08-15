package Deneme;

import java.util.Scanner;

public class D15 {
    // 15: Type code to check if a number has 3 digits or not. Use ternary.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int number = scanner.nextInt();

       String result = number > 99 && number < 1000 ? number + " has 3 digits" : number + " has not 3 digits";

        System.out.println("result = " + result);


    }
}

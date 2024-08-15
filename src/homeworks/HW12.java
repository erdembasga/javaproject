package homeworks;

import java.util.Scanner;

public class HW12 {
    //12: Write a program to check if a person is eligible to vote. Assume the voting age is 18
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        if (age>=18) {
            System.out.println("You are eligible to vote");
        } else if (age<0) {
            System.out.println("Age can not be less than zero");
        } else {
            System.out.println("You are NOT eligible to vote");
        }

    }
}

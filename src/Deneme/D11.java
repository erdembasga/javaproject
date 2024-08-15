package Deneme;

import java.util.Scanner;

public class D11 {
    //11: Write a program to find the largest of two numbers.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number");
        double num2 = scanner.nextDouble();

        if (num1>num2){
            System.out.println(num1 + " is greater");
        } else if (num1<num2) {
            System.out.println(num2 + " is greater");
        } else{
            System.out.println("Numbers are equals");
        }
    }
}

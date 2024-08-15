package homeworks;

import java.util.Scanner;

public class HW13 {
    //13: Write a program that takes three integers from the user and prints the largest and smallest among them.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number");
        int num3 = scanner.nextInt();

        int largest;
        if (num1>=num2 && num1>=num3){
            largest = num1;
        } else if (num2>=num1 && num2>=num3){
            largest = num2;
        } else {
            largest = num3;
        }

        System.out.println("largest = " + largest);

        int smallest;
        if (num1<=num2 && num1<=num3){
            smallest = num1;
        } else if (num2<=num1 && num2<=num3){
            smallest = num2;
        } else {
            smallest = num3;
        }

        System.out.println("smallest = " + smallest);


    }
}

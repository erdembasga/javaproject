package Deneme;

import java.util.Scanner;

public class D17 {
//17: Type code to create a simple calculator that performs addition, subtraction,
// multiplication, division, and percentage calculation using a switch statement.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number");
        double num2 = scanner.nextDouble();

        System.out.println("Enter operation: '+, -, *, /, %'");
        String operation = scanner.next();



        double result = 0;

        switch (operation){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2==0){
                    System.out.println("Error: Division by zero");
                } else {
                    result = num1 / num2;
                }
                break;
            case "%":
                result = (num1 * num2) / 100;
                break;
            default:
                System.out.println("Invalid Operation");
                break;
        }

        System.out.println(result);
    }
}

package practices.practice04;

import java.util.Scanner;

public class Q02_WhileLoop_ProductOfEvenDigits {
    //Type code to get product of even digits of an integer.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = scanner.nextInt();

        System.out.print("Product of even digits: " + getProductOfEvenDigits(number));

    }

    public static int getProductOfEvenDigits(int num) {

        num = Math.abs(num);//Make sure number is positive

        int product = 1;

        boolean hasEvenDigits = false;

        while (num > 0) {

            int digit = num % 10;

            if (digit % 2 == 0) {
                product = product * digit;
                hasEvenDigits = true;
            }
            num = num / 10;

        }

        return hasEvenDigits ? product : 0;

    }

}

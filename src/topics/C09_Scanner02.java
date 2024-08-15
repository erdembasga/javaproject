package topics;

import java.util.Scanner;

public class C09_Scanner02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of one side of the square:");

        double length = scanner.nextDouble();

        double area = length * length;

        System.out.println("Area: " + area);

        scanner.close();



    }
}

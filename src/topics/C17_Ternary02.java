package topics;

import java.util.Scanner;

public class C17_Ternary02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side 1");
        double side1 = scanner.nextDouble();
        System.out.println("Enter side 2");
        double side2 = scanner.nextDouble();
        System.out.println("Enter side 3");
        double side3 = scanner.nextDouble();

        String result =  side1==side2  && side2==side3 ? "Equilateral" : side1==side2 || side2==side3 || side1==side3 ? "Isosceles" : "Scalene";

        System.out.println("The triangle is " + result);

    }
}

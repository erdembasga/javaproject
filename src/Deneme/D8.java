package Deneme;

import java.util.Scanner;

public class D8 {
    //08: Type code that uses the Scanner class to calculate the volume of a cone.
    //Hint: Use Math.pow() method to calculate a number's power
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius");
        double radius = scanner.nextDouble();
        System.out.println("Enter height");
        double height = scanner.nextDouble();

        double v = Math.PI*Math.pow(radius, 2)*height/3;

        System.out.printf("" + "v of the cone is : %.2f" , v);
    }
}

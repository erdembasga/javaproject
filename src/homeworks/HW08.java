package homeworks;

import java.util.Scanner;

public class HW08 {
    //08: Type code that uses the Scanner class to calculate the volume of a cone.
    //Hint: Use Math.pow() method to calculate a number's power
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Radius");
        double radius = scanner.nextDouble();
        System.out.println("Enter Height");
        double height = scanner.nextDouble();

        double volume = Math.PI*Math.pow(radius, 2)*height/3;

        System.out.printf("" +
                "volume of the cone is: %.2f",volume);

    }






}

package topics;

import java.util.Scanner;

public class C10_Scanner03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius:");

        float radius = scanner.nextFloat();
        float pi = 3.14159F;

        float perimeter = 2*radius*pi;
        System.out.println("perimeter = " + perimeter);

        float area = radius * radius *pi;
        System.out.println("area = " + area);







    }
}

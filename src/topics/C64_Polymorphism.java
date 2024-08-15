package topics;

import another_package.Circle;
import another_package.Shape;

public class C64_Polymorphism {

    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println("circle.name = " + circle.name);
        System.out.println("circle.calculateArea() = " + circle.calculateArea());

        Shape shape = new Shape();
        System.out.println("shape.name = " + shape.name);
        System.out.println("shape.calculateArea() = " + shape.calculateArea());

        Shape shape1 = new Circle();
        System.out.println("shape1.name = " + shape1.name);
        System.out.println("shape1.calculateArea() = " + shape1.calculateArea());

    }

}

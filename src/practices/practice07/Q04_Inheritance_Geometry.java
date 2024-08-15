package practices.practice07;

public class Q04_Inheritance_Geometry {
    // Type code to calculate Rectangle and Circle's perimeter and area. Use inheritance. Get methods from a parent class.
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5,6);
        double r1Area = rectangle1.getArea();
        double r1Perimeter = rectangle1.getPerimeter();
        System.out.println("r1Area = " + r1Area);
        System.out.println("r1Perimeter = " + r1Perimeter);

        Rectangle rectangle2 = new Rectangle(10,15);
        System.out.println("rectangle2 perimeter: "+rectangle2.getPerimeter());
        System.out.println("rectangle2 area: "+rectangle2.getArea());

        Circle circle1 = new Circle(5);
        System.out.println("Circle1 Area: "+circle1.getArea());
        System.out.println("Circle1 Perimeter: "+circle1.getPerimeter());

        Circle circle2 = new Circle(10);
        System.out.println("Circle2 Area: "+circle2.getArea());
        System.out.println("Circle2 Perimeter: "+circle2.getPerimeter());

    }

}

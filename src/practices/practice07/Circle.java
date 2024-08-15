package practices.practice07;

public class Circle extends Geometry{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter(){
        return circlePerimeter(radius);
    }

    public double getArea(){
        return circleArea(radius);
    }
}
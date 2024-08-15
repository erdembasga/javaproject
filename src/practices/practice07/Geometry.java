package practices.practice07;

public class Geometry {
    public double rectanglePerimeter(int length, int width) {
        return 2 * (length + width);
    }

    public double rectangleArea(int length, int width) {
        return length * width;
    }

    public double circlePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

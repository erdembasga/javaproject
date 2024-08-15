package practices.practice07;

public class Rectangle extends Geometry {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter(){
        return rectanglePerimeter(length, width);
    }

    public double getArea(){
        return rectangleArea(length, width);
    }
}

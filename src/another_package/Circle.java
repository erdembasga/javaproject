package another_package;

public class Circle extends Shape{

    public String name = "Circle";
    int radius = 5;


    public int calculateArea(){

        return (int) (Math.PI * radius * radius);
    }

}

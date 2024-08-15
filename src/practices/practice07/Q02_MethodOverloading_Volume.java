package practices.practice07;

public class Q02_MethodOverloading_Volume {
    // Create a method that calculates the volume of a cube, square prism, and rectangular prism. (Use method overloading)
    public static void main(String[] args) {

        //volume of a cube
        int volumeOfCube = volume(5);
        System.out.println("volumeOfCube = " + volumeOfCube);

        //volume of a square prism
        int volumeOfSquarePrism = volume(5, 10);
        System.out.println("volumeOfSquarePrism = " + volumeOfSquarePrism);

        //volume of a rectangular prism
        int volumeOfRectangularPrism = volume(5, 8, 10);
        System.out.println("volumeOfRectangularPrism = " + volumeOfRectangularPrism);


    }

    //volume of a cube
    public static int volume(int side) {

        return side * side * side;
    }

    //volume of a square prism
    public static int volume(int side, int height) {

        return side * side * height;
    }

    //volume of a rectangular prism
    public static int volume(int length, int width, int height) {

        return length * width * height;
    }


}

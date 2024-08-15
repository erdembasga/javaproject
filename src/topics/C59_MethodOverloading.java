package topics;

public class C59_MethodOverloading {

    public static void main(String[] args) {

        System.out.println(add(6,4));
        System.out.println(add(6,4,5));
        System.out.println(add(6.5, 5.5));
        System.out.println(add(5, 15, "The result is: "));

    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static String add(int x, int y, String message) {
        return message + (x + y);
    }

    public static int add(int x, int y, int z) {

        return x + y + z;

    }
    public static double add(double x, double y) {

        return x + y;

    }
}

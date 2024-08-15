package homeworks;

public class HW06 {
    //06: What is the default value of an uninitialized variable of type int in a Java class?

    static int number;
    static String name;
    static Integer number2;

    public static void main(String[] args) {

        System.out.println(number);//0
        System.out.println(name);//null
        System.out.println(number2);//null
    }
}

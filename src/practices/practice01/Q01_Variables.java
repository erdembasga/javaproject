package practices.practice01;

public class Q01_Variables {

    public static void main(String[] args) {

        //Initialize a variable named age
        int age = 35;
        int herAge;//Declare a variable named herAge

        System.out.println("age = " + age);

        //Copy variable value:
        herAge = age;

        System.out.println("herAge = " + herAge);

        // Declare multiple variables on the same line
        int year = 2024, month = 6, day = 20; //Not recommended because of code readability.
        System.out.println("year = " + year);
        System.out.println("month = " + month);
        System.out.println("day = " + day);

        // Declare a variable: x
        int x;

        // Initialize a variable: y
        int y = 50;

        // Initialize another variable: z
        int z = 2024;

        // Initialize variable x by z
        x = z;

        // Initialize variable x with the value of y
        x = y;

        // Update y
        y = 25;

        // Print variables
        System.out.println("x = " + x);//50
        System.out.println("y = " + y);//25
        System.out.println("z = " + z);//2024

    }

}

package practices.practice01;

public class Q02_Credentials {

/*
    Write a code that prints the variables first name, last name, age, height, and weight to the console as follows:
        First Name: ...
        Last Name : ...
        Age: ...
        Height: ...
        Weight: ...
    Note: Use only one "System.out.println();"
*/


    public static void main(String[] args) {

        String firstname = "Mary";
        String lastname = "Star";
        byte age = 30;
        double height = 1.60;
        double weight = 55.5;

        //If you use \n inside a String it will print the right side of that in the next line.
        System.out.println("First Name: " + firstname +
                "\nLast Name: " + lastname +
                "\nAge: " + age+
                "\nHeight: "+height+
                "\nWeight: "+weight);

    }



}

package practices.practice07;

import java.util.Arrays;

public class Q01_Varargs_UserInfo {
    // Create a method that takes first name, last name, age, and cities lived in so far as parameters, and prints them along with the number of cities lived in.
    public static void main(String[] args) {

        userInfo("John", "Doe", 25, "New York", "Ada", "Luz");

        userInfo("Mary", "Star", 35, "Oma");

    }

    public static void userInfo(String firstname, String lastname, int age, String... city){

        System.out.println("firstname = " + firstname);
        System.out.println("lastname = " + lastname);
        System.out.println("age = " + age);
        System.out.println("cities lived so far = " + Arrays.toString(city));
        System.out.println("Number of cities lived in: "+city.length);

    }

}

package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class HW38 {
    //38: Create a Java program that models a simple hierarchy for a school system.
/*
    Implement the following classes:
    Person: This is the base class with attributes for name and age.
    Student: This class inherits from Person and adds a unique student ID and a list of courses the student is enrolled in.
    Teacher: This class inherits from Person and adds a unique teacher ID and the subject they teach.
    Implement the necessary constructors, getters, and setters. Then, demonstrate the creation of objects from these classes and display their information.
*/

    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<>(Arrays.asList("Math","English", "PE"));

        Student student1 = new Student("John",15, "John15", courses);
        System.out.println("student1 = " + student1);

        Teacher teacher1 = new Teacher("Mary", 40,"Mary40", courses);
        System.out.println("teacher1 = " + teacher1);


        courses.add("XYZ");
        Teacher teacher2 = new Teacher("Tom", 45,"Tommy", courses);
        System.out.println("teacher2 = " + teacher2);


    }
}

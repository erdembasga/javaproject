package practices.practice06;

import java.util.ArrayList;
import java.util.Arrays;

public class Q01_Constructor_StudentList {
    //Type code to register a student with his name, age, grade, parent and the books read

    public static void main(String[] args) {

        Book book1 = new Book("Peter Pan", "J.M. Barrie", 150);
        Book book2 = new Book("Oliver Twist", "Charles Dickens", 350);
        Book book3 = new Book("Harry Potter", "J.K. Rowling", 600);


        Parent parent1 = new Parent("Emma", 35, false);
        Parent parent2 = new Parent("Sara", 40, true);

        Student student1 = new Student("John", "Doe", 8, 2, parent1, new ArrayList<>(Arrays.asList(book1)));
        Student student2 = new Student("Mary", "Star", 7, 1, parent2, new ArrayList<>());
        Student student3 = new Student("Bill", "Star", 9, 3, parent2, new ArrayList<>(Arrays.asList(book1, book2, book3)));
        Student student4 = new Student("Lisa", "Ray", 10, 4, new Parent("Alan", 38, false), new ArrayList<>(Arrays.asList(book1, book2, book3, new Book("A","B", 15))) );

        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
        System.out.println("student3 = " + student3);
        System.out.println("student4 = " + student4);


    }


}

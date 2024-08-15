package practices.practice02;

import java.util.Scanner;

public class Q04_Scanner_NameAndAge {
/*
    Write a code that asks the user for their name with year of birth
    and greets the user with that name and age.
*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your year of birth");
        int yob =  scanner.nextInt();
        int age = 2024 - yob;

        System.out.println("Hello " + name + ". Your age is " + age + ".");


    }
}

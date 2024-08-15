package homeworks;

import java.util.Scanner;

public class HW14 {
//14: Write a Java program that determines the retirement status of a worker
// based on their gender and age. The program should:
/*
    Prompt the user to enter their gender as "male", "female", or "others".
    Prompt the user to enter their age.
    Display the following messages based on the input:
    If the age is negative, print "Invalid age".
    If the gender is "male" and the age is 65 or younger, print "He should work".
    If the age is greater than 65, print "He should be retired".
    If the gender is "female" and the age is 60 or younger, print "She should work".
    If the age is greater than 60, print "She should be retired".
    If the gender is "others", print "Undefined".
 */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your gender as \"male\", \"female\", or \"others\"");
        String gender = scanner.nextLine();
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        if (age<0){
            System.out.println("Invalid age");
        }else if (gender.equalsIgnoreCase("male")){
            if (age<=65){
                System.out.println("He should work");
            } else {
                System.out.println("He should be retired");
            }
        } else if (gender.equalsIgnoreCase("female")) {

            if (age<=60){
                System.out.println("She should work");
            }else {
                System.out.println("She should be retired");
            }

        } else {
            System.out.println("Undefined");
        }


    }

}

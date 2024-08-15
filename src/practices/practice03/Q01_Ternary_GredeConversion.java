package practices.practice03;

import java.util.Scanner;

public class Q01_Ternary_GredeConversion {
/*
    Write a code that converts the grade given by the user in percentage to the letter grade system using a ternary operator.
    (90 and above A, 80-89 B, 70-79 C, 60-69 D, 50-59 E, Others F)
*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade as number");

        int grade = scanner.nextInt();

        String letterGrade = grade>100 || grade<0 ? "Enter the grade between 0-100"
                : grade >89 ? "A"//When you write code you need to test the critical point/boundaries first
                : grade >79 ? "B"
                : grade >69 ? "C"
                : grade >59 ? "D"
                : grade >49 ? "E"
                : "F";

        System.out.println("Your letter grade is: "+ letterGrade);

    }

}

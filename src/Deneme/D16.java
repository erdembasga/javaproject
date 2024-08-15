package Deneme;

import java.util.Scanner;

public class D16 {
//16: Type Java code using nested ternary operators to check if a year is a leap year or not.
/*
A leap year is a year that has one additional day added to keep the calendar year synchronized
with the astronomical year or seasonal year. This additional day is February 29, making the total
number of days in a leap year 366 instead of the usual 365.

Leap Year Rules:
Divisible by 4: If a year is evenly divisible by 4, it is a leap year, except for the following cases.
Divisible by 100: If a year is evenly divisible by 100, it is not a leap year, unless:
Divisible by 400: If a year is evenly divisible by 400, it is a leap year.
*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year");
        int year = scanner.nextInt();

        String result = year % 400 == 0 ? "Leap year" : year % 4 == 0 && year % 100 != 0 ? "Leap year" : "Not leap year";

        System.out.println("result = " + result);


    }
}

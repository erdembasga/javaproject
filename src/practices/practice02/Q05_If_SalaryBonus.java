package practices.practice02;

import java.util.Scanner;

public class Q05_If_SalaryBonus {
/*
   A company decided to give bonus of 5% of salary to employee if his/her year of
   service is 5 and more than 5 years.
   Ask user for their salary and year of service and print the net bonus amount.
   If employee can not get bonus, print how many more years he/she should work.

   EXAMPLE:
   INPUT   :   Year    => 4 year service
               Salary  => 4000

   OUTPUT :  You need to work 1 year(s) to get bonus
*/


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of service");
        int year =  scanner.nextInt();
        System.out.println("Enter your salary");
        int salary = scanner.nextInt();

        if (year < 0) {

            System.out.println("Invalid year. Year can not be negative");

        } else if (salary <0) {

            System.out.println("Invalid salary. Salary can not be negative");

        } else if (year >= 5) {

            System.out.println("Your bonus is: " + (salary * 5 / 100) + "$.");
            
        } else {

            System.out.println("You need to work " + (5 - year) + " more years to get bonus");

        }





    }

}

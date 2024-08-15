package practices.practice08;

import java.util.Scanner;

public class Q01_MethodOverriding_Credit {
    // Write a code that registers customers who take credit from a bank by creating objects according to their credit types.
    // Retired: 12% standard interest, Worker: 15% worker rate, Officer: 10% officer rate
    // Extra: To use the program, set a password. If the password is entered incorrectly 3 times, display a block message.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        String password = "123A";

        while (true){
            counter++;
            System.out.println("Enter password:");

            if (scanner.nextLine().equals(password)){
                System.out.println("Access granted!!! Welcome to interest calculator.");
                break;//This code will take execution outside the loop. Execution will continue...
            } else if (counter==3) {
                System.err.println("Your account is blocked!");
                System.exit(0);//This code will finish the execution.
            } else {
                System.out.println("Incorrect password. Try again!");
                System.out.println("You have "+(3-counter)+ " login attempts remaining.");
            }

        }

        Retired retired = new Retired();
        double retiredInterest = retired.calculateInterest(100);
        System.out.println("retiredInterest = " + retiredInterest);//12

        Worker worker = new Worker();
        double workerInterest = worker.calculateInterest(100);
        System.out.println("workerInterest = " + workerInterest);//15

        Officer officer = new Officer();
        double officerInterest = officer.calculateInterest(100);
        System.out.println("officerInterest = " + officerInterest);//10

    }

}

package topics;

import java.util.Scanner;

public class C08_Scanner01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");

        String name = scanner.nextLine();

        System.out.println("Hello " + name + ", How are you?");

        System.out.println("Enter your Birthday: ");

        int year = scanner.nextInt();

        System.out.println("You are " + (2024 - year) + " years old");

        scanner.close();


    }
}

package practices.practice03;

import java.util.Scanner;

public class Q03_SM_NameSurname {
    /*
        Separate a 2-word name and surname, which you will get from the user in one go, into 2 separate words,
        and print the name and surname separately on the screen.
        Example:
        Name: John
        Surname: Doe
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your firstname ans lastname separated by a space:");
        String fullName = scanner.nextLine().trim().replaceAll("[^A-Za-z ]", "").replaceAll("\\s+", " ");

        String firstnameFirstChar = fullName.split(" ")[0].substring(0, 1).toUpperCase();
        String lastnameFirstChar = fullName.split(" ")[1].substring(0, 1).toUpperCase();

        String firstname = firstnameFirstChar + fullName.split(" ")[0].substring(1).toLowerCase();
        String lastname = lastnameFirstChar + fullName.split(" ")[1].substring(1).toLowerCase();

        System.out.println("Name: " + firstname);
        System.out.println("Surname: " + lastname);

    }
}

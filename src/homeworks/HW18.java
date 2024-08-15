package homeworks;

import java.util.Scanner;

public class HW18 {
    //18: Write Java program that counts the number of letters in a given string
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scanner.nextLine().replaceAll("[^A-Za-z]", "");
        System.out.println(str);

        System.out.println(str.length());


    }

}

package homeworks;

import java.util.Scanner;

public class HW19 {
    //19: Type code to convert white spaces in a given string into underscores.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");

        String str = scanner.nextLine().replaceAll("\\s+", "_");
        System.out.println(str);


    }
}

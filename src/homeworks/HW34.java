package homeworks;

import java.util.Locale;
import java.util.Scanner;

public class HW34 {
//34: Write code to check if a String value is a palindrome.
//Hint: Use StringBuilder
/*
Palindrome example:
    Don't nod.
    I did, did I?
    Step on no pets.
    Eva, can I see bees in a cave?
    Was it a cat I saw?
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = scanner.nextLine().trim().toLowerCase().replaceAll("[^a-z]", "");
        System.out.println(str);

//        String reverse = "";
//
//        for (int i=str.length()-1; i>=0; i--){
//            reverse += str.charAt(i);
//        }
//
//        System.out.println("reverse = " + reverse);
//        if (str.equals(reverse)){
//            System.out.println("Palindrome");
//        } else {
//            System.out.println("Not Palindrome");
 //       }

        StringBuilder stb = new StringBuilder(str);
        String reversedStr = stb.reverse().toString();
        System.out.println(reversedStr);

        if (str.isEmpty()) {
            System.out.println("Enter a valid String");
        } else if (str.equals(reversedStr)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
       }

    }
}

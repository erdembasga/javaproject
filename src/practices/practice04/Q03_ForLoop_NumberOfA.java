package practices.practice04;

import java.util.Scanner;

public class Q03_ForLoop_NumberOfA {
/*
     Ask the user to enter a String and count the number of 'a's that come before the first occurrence of 'c' and the number of 'a's that come after the last occurrence of 'c'.
*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.nextLine();

        int counterBefore = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a') {
                counterBefore++;
            } else if (str.charAt(i) == 'c') {
                break;
            }

        }

        System.out.println("Number of 'a's that come before the first occurrence of 'c' : " + counterBefore);

        int counterAfter = 0;
        for (int i = str.length()-1; i >= 0; i--){

            if (str.charAt(i) == 'a') {
                counterAfter++;
            } else if (str.charAt(i) == 'c') {
                break;
            }

        }

        System.out.println("Number of 'a's that come after the last occurrence of 'c' : "+counterAfter);


    }
}

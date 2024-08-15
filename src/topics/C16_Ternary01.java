package topics;

import java.util.Scanner;

public class C16_Ternary01 {
    public static void main(String[] args) {

        System.out.println("Enter an integer");
        int x = new Scanner(System.in).nextInt();

        String result = x>0 ? "Number is greater than zero" : (x<0) ? "Number is less than 0" : "Number equals zero";

        System.out.println("result = " + result);
    }
}

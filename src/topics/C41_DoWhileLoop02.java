package topics;

import java.util.Scanner;

public class C41_DoWhileLoop02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;

        do {
            System.out.println("Enter a positive number:");
            number = scanner.nextInt();

            if (number > 0){
                sum += number;
            }



        }while (number >= 0);

        System.out.println("You entered a negative number, here is the sum: "+sum);

    }
}

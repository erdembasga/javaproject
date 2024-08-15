package homeworks;

import java.util.Scanner;

public class HW23 {
    //23: Write a code that adds randomly picked letters to a String to form
    // your name and prints how many tries it took.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String randomName = "";
        int counter = 0;

        for (int i = 0; i<name.length(); i++){

            while (true){
                counter++;
                char randomChar = alphabet.charAt((int) (Math.random() * alphabet.length()));
                if (name.charAt(i) == randomChar){
                    randomName += randomChar;
                    break;

                }
            }

        }

        System.out.println(randomName);
        System.out.println("counter = " + counter);

    }
}

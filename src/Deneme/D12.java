package Deneme;

import java.util.Scanner;

public class D12 {
    //12: Write a program to check if a person is eligible to vote. Assume the voting age is 18
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int age = scanner.nextInt();

        if (age>= 18){
            System.out.println("Oy kullanabilirsiniz");
        } else if (age < 0) {
            System.out.println("Girdiginiz yas eksi olamaz");
        } else {
            System.out.println("Oy kullanamazsiniz");
        }
    }
}

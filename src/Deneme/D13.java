package Deneme;

import java.util.Scanner;

public class D13 {
    //13: Write a program that takes three integers from the
    // user and prints the largest and smallest among them.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ilk sayiyi giriniz");
        int num1 = scanner.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        int num2 = scanner.nextInt();
        System.out.println("ucuncu sayiyi giriniz");
        int num3 = scanner.nextInt();

        int enBuyukSayi;
        if (num1>=num2 && num1>=num3){
            enBuyukSayi = num1;
        } else if (num2>=num1 && num2>=num3) {
            enBuyukSayi = num2;
        } else {
            enBuyukSayi = num3;
        }

        System.out.println("enBuyukSayi = " + enBuyukSayi);

        int enKucukSayi;
        if (num1<=num2 && num1<=num3){
            enKucukSayi = num1;
        } else if (num2<=num1 && num2<=num3) {
            enKucukSayi = num2;
        } else {
            enKucukSayi = num3;
        }

        System.out.println("enKucukSayi = " + enKucukSayi);
    }
}

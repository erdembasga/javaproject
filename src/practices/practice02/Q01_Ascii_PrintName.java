package practices.practice02;

public class Q01_Ascii_PrintName {
    //Type code to print 'John' without any letter it contains

    public static void main(String[] args) {

        char ch01 = 'K' - 1;
        char ch02 = 'p' - 1;
        char ch03 = 'i' - 1;
        char ch04 = 'o' - 1;

        System.out.println("" + ch01 + ch02 + ch03 + ch04);

        //When we do math operation between two chars, Java will use ascii values of chars.


    }

}

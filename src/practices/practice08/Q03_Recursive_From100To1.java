package practices.practice08;

public class Q03_Recursive_From100To1 {
    // Create a method that prints numbers from 100 to 1 without using loops and numbers.

    public static void main(String[] args) {

        print('A');

    }

    public static void print(char c) {

        if (c > 'a' - 'a') {
            System.out.print((int) c + " ");
            c--;
            print(c);//This method calls itself
        }

    }

}


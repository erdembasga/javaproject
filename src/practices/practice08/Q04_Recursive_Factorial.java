package practices.practice08;

public class Q04_Recursive_Factorial {
    // Write a method to calculate factorial. (Do not use loops.)
    //A factorial of a non-negative integer n is the product of all positive integers up to n.

    public static void main(String[] args) throws Exception {

        int result =  factorial(23);
        System.out.println("result = " + result);

    }

    public static int factorial(int number) throws Exception {
        if (number >= 0) {
            if (number == 0 || number == 1) {
                return 1;
            } else {
                return number * factorial(number - 1);
            }
        } else {
            throw new Exception("Number must be positive!!!");
        }


    }

}

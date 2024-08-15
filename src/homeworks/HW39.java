package homeworks;

public class HW39 {
    //39: Create a class Operation with a method calculate() that performs a basic addition of two integers.
    // Then, create subclasses Multiplication and Division that override the calculate() method to perform multiplication and division, respectively.
    // In the main method, demonstrate the overridden methods.
/*
    Steps:
    Define the Operation class with a calculate(int a, int b) method that returns the sum of a and b.
    Define the Multiplication class that extends Operation and overrides the calculate(int a, int b) method to return the product of a and b.
    Define the Division class that extends Operation and overrides the calculate(int a, int b) method to return the quotient of a and b.
    In the main method, create instances of Multiplication and Division and call their respective calculate() methods.
*/

    public static void main(String[] args) {
        Multiplication multiplication = new Multiplication();
        int result1 = multiplication.calculate(5,2);
        System.out.println("result1 = " + result1);

        Division division = new Division();
        int result2 = division.calculate(6,0);
        System.out.println("result2 = " + result2);

    }
}

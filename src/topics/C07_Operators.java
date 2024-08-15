package topics;

public class C07_Operators {
    public static void main(String[] args) {

        // Addition
        int a = 5;
        int b = 3;
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Subtraction
        int x = 10;
        int y = 7;
        int difference = x - y;
        System.out.println("Difference: " + difference);

        // Multiplication
        int p = 4;
        int q = 6;
        int product = p * q;
        System.out.println("Product: " + product);

        // Division
        int m = 20;
        int n = 5;
        int quotient = m / n;
        System.out.println("Quotient: " + quotient);

        // Modulus
        int num1 = 10;
        int num2 = 3;
        int remainder = num1 % num2;
        System.out.println("Remainder " + remainder);

        // Assigning
        int num3 = 10;

        // Addition assignment operator
        num3 += 5; // Equivalent to: num3 = num3 + 5
        System.out.println("num3 after addition: " + num3);

        // Subtraction assignment operator
        num3 -= 3;
        System.out.println("num3 after subtraction: " + num3);

        // Multiplication assignment operator
        num3 *= 2;
        System.out.println("num3 after multiplication" + num3);

        // Division assignment operator
        num3 /= 4;
        System.out.println("num3 after division: " + num3);

        // Modulus assignment operator
        num3 %= 5;
        System.out.println("num3 after modulus" + num3);

        int num4 = 5;
        int num5 = 10;

        // Equal to (==)
        boolean isEqual = num4 == num5;
        System.out.println("Is num4 equal to num5? " + isEqual);

        // Not equal to (!=)
        boolean isNotEqual = (num4 != num5);
        System.out.println("Is num4 not equal to num5? " + isNotEqual);

        // Grater than (>)
        boolean isGreaterThan = (num4 > num5);
        System.out.println("Is num4 greater than num5? " + isGreaterThan);

        // Less than (<)
        boolean isLessThan = (num4 < num5);
        System.out.println("Is num4 less than num5? " + isLessThan);

        //Greater than or equal to (>=)
        boolean isGreaterThanOrEqual = (num4 >= num5);
        System.out.println("Is num4 greater than or equal to num5? " + isGreaterThanOrEqual);

        // Less than equal to (<=)
        boolean isLessThanOrEqual = (num4 <= num5);
        System.out.println("Is less than or equal to num5? " + isLessThanOrEqual);

        boolean boolA = true;
        boolean boolB = false;

        // Logical AND (&&)
        boolean resultAnd = boolA && boolB;
        System.out.println("Result of logical AND: " + resultAnd);

        // Logical OR (||)
        boolean resultOr = boolA || boolB;
        System.out.println("Result of logical OR: " + resultOr);

        // Logical Not (!)
        boolean resultNotA = !boolA;
        boolean resultNotB = !boolB;
        System.out.println("Result of logical NOT for boolA: " + resultNotA);
        System.out.println("Result of logical NOT for boolB: " + resultNotB);








    }
}

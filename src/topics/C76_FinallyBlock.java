package topics;

public class C76_FinallyBlock {

    public static void main(String[] args) {

        try {
            divide(6,1);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Divide method called");
        }


    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return dividend / divisor;
    }


}

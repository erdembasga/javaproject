package practices.practice02;

public class Q03_WrapperClass_ValueOf {
/*
    Add two numbers assigned in a string container below to Byte's maximum value. Then subtract them from Byte's minimum value.
    String num1 = "3";
    String num2 = "4";
*/
    public static void main(String[] args) {

        Byte max = Byte.MAX_VALUE;
        String num1 = "3";
        String num2 = "4";
        byte num1Byte = Byte.parseByte(num1);
        byte num2Byte =  Byte.parseByte(num2);

        int sum = max + num1Byte + num2Byte;

        System.out.println("sum = " + sum);

        byte min = Byte.MIN_VALUE;

        System.out.println("min = " + min);

        int substraction =  min - num1Byte - num2Byte; //This value will exceed the Byte's limit then
                                                        // we need to put it into int container.
        System.out.println("substraction = " + substraction);

    }
}

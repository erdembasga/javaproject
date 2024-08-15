package topics;

public class C06_TypeCasting {

    public static void main(String[] args) {

        // Example 1 : Casting double to int
        double doubleValue = 3.14;
        int intValue = (int) doubleValue;
        System.out.println("intValue = " + intValue);
        System.out.println("doubleValue = " + doubleValue);

        // Example 2: Casting int to double
        int integerValue = 10;
        double doubleResult = integerValue;
        System.out.println("integerValue = " + integerValue);
        System.out.println("doubleResult = " + doubleResult);

        // Example 3: Casting char to int
        char charValue = 'A';
        int intValueFromChar = charValue;
        System.out.println("intValueFromChar = " + intValueFromChar);

        // Widening Conversion
        byte byteVolue = 10;
        short shortValue = byteVolue;
        int intValueWidening = shortValue;
        long longValue = intValueWidening;
        float floatValue = longValue;
        double doubleValueWidening = floatValue;
        System.out.println("doubleValueWidening = " + doubleValueWidening);

        // Narrowing Conversin
        double anotherDoubleValue = 123.456;
        float float2 = (float) anotherDoubleValue;
        long long2 = (long) float2;
        int int2 = (int) long2;
        short short2 = (short) int2;
        byte byte2 = (byte) short2;
        System.out.println("byte2 = " + byte2);


    }



}

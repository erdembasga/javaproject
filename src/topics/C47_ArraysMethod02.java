package topics;

import java.util.Arrays;

public class C47_ArraysMethod02 {
    public static void main(String[] args) {

        String str = "Hello world!   How     are you?";

        String[] strArr = str.split("\\s+");

        System.out.println("strArr = " + Arrays.toString(strArr));


        String str3 = "apple!banana!orange!mango";
        String[] parts3 = str3.split("!", 2);

        System.out.println("parts3 = " + Arrays.toString(parts3));

        String  str2 = "Hello";
        char[] charArray = str2.toCharArray();

        System.out.println("charArray = " + Arrays.toString(charArray));

        String strNumbers = "1.0,2.5,3.7,4.2,5.9";

        String[] strArr2 = strNumbers.split(",");
        System.out.println("strArr2 = " + Arrays.toString(strArr2));

        double[] doubleArr = new double[strArr2.length];

        System.out.println("doubleArr = " + Arrays.toString(doubleArr));

        for (int i=0; i<strArr2.length; i++){

            doubleArr[i] = Double.valueOf(strArr2[i]);

        }

        System.out.println("doubleArr = " + Arrays.toString(doubleArr));


    }
}

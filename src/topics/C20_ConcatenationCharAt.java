package topics;

public class C20_ConcatenationCharAt {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";

        String result1 = str1.concat(str2);
        System.out.println("result1 = " + result1);

        String result2 = str1 + str2;
        System.out.println("result2 = " + result2);

        String str = "Hello";
        char character = str.charAt(4);
        System.out.println("character = " + character);


    }
}

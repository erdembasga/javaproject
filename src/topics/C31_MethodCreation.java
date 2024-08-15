package topics;

import java.util.Locale;

public class C31_MethodCreation {
    public static void main(String[] args) {

        greet();

        int addResult = add(6, 4);
        System.out.println(addResult);

        String strResult =  greetWithName("John");
        System.out.println(strResult);

    }

    public static void greet(){

        System.out.println("Hello World");

    }

    public static int add(int a, int b){

        int result = a + b;

        return result;

    }

    public static String greetWithName(String name){
        String greet = "Hello, " + name + "!";
        return greet;
    }


}

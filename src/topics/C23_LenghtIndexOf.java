package topics;

public class C23_LenghtIndexOf {
    public static void main(String[] args) {

        String str = "Hello";
        int lenght = str.length();
        System.out.println(lenght);

        String str1 = "Hello World";
        int index1 = str1.indexOf("World");
        System.out.println("index1 = " + index1);

        int index2 = str1.indexOf("Java");
        System.out.println("index2 = " + index2);

        int index3 = str1.indexOf( "l", 4);
        System.out.println("index3 = " + index3);








    }
}

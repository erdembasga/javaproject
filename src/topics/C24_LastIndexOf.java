package topics;

public class C24_LastIndexOf {
    public static void main(String[] args) {

        String str1 = "Hello World";
        int lastIndex1 = str1.lastIndexOf('o');
        System.out.println("lastIndex1 = " + lastIndex1);

        String str2 = "Java is fun and Java is cool";
        int lastIndex2 = str2.lastIndexOf("is");
        System.out.println("lastIndex2 = " + lastIndex2);

        String str3 = "Java is fun and Java is cool";
        int lastIndex3 = str3.lastIndexOf("Java", 15);
        System.out.println("lastIndex3 = " + lastIndex3);




    }
}

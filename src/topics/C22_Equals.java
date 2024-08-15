package topics;

public class C22_Equals {
    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";

        boolean isEquals1 = str1.equals(str2);
        System.out.println("isEquals1 = " + isEquals1);
        boolean isEquals2 = str1.equals(str3);
        System.out.println("isEquals2 = " + isEquals2);

        String str4 = "Hello";
        boolean isEquals3 =  str1.equalsIgnoreCase(str4);
        System.out.println("isEquals3 = " + isEquals3);
        boolean isEquals4 =  str1.equals(str4);
        System.out.println("isEquals4 = " + isEquals4);






    }
}

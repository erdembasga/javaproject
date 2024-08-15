package topics;

public class C27_IsEmptyReplace {
    public static void main(String[] args) {

        String str1 = "";
        String str2 = "Hello";

        System.out.println(str1.isEmpty());
        System.out.println(str2.isEmpty());

        String str3 = "Hello World";
        String replacedStr1 = str3.replace("o","X");
        System.out.println("Example 1 = " + replacedStr1);

        String str4 = "The cat sat on the mat";
        String replacedStr2 = str4.replace("cat","dog");
        System.out.println("Example 2 = " + replacedStr2);

        String str5 = "Spaces will be removed";
        String replacedStr3 = str5.replace(" ","");
        System.out.println("Example 3 = " + replacedStr3);

    }
}

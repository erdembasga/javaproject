package topics;

public class C30_ReplaceAllRegex {
    public static void main(String[] args) {

        String str1 = "banana";
        String replacedStr1 = str1.replaceAll("a","*");
        System.out.println("replacedStr1 = " + replacedStr1);



        String str2 = "123abc456def789";
        String replacedStr2 = str2.replaceAll("\\d","x");
        System.out.println("replacedStr2 = " + replacedStr2);


        String str3 = "Hello World";
        String replacedStr3 = str3.replaceAll("\\s","-");
        System.out.println("replacedStr3 = " + replacedStr3);


    }
}

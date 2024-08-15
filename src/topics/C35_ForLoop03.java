package topics;

public class C35_ForLoop03 {

    public static void main(String[] args) {

        String reversed = convertToReverse("Mary Alen");
        System.out.println(reversed);

    }

    public static String convertToReverse(String str){

        String reversedString = "";


        for (int i = str.length() - 1; i>=0; i--){

            reversedString += String.valueOf(str.charAt(i));

        }

        return reversedString;
    }
}

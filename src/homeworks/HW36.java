package homeworks;

public class HW36 {
    //36: Write a method that sums the character counts of all parameters except the first one and multiplies this sum by the character count of the first parameter. (do not use index and if statements)
    public static void main(String[] args) {

        int result = sumOfChars("Hello", "World", "Hi");
        System.out.println("result = " + result);

    }

    static int sumOfChars(String str1, String... str2) { 

        int sum = 0;

        for (String w : str2) {
            sum += w.length();
        }

        return sum * str1.length();
    }
}

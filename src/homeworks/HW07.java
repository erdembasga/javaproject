package homeworks;

public class HW07 {
    //07: Type code to swap two variables.
    public static void main(String[] args) {

        int a = 5;
        int b = 7;

        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}

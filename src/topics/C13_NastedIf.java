package topics;

public class C13_NastedIf {
    public static void main(String[] args) {

        int x = 1;
        int y = 1;

        if (x>5) {
            if (y>2){
                System.out.println("Both x and y are greater than 2");
            }else {
                System.out.println("x is greater than 2 but y is not");
            }
        }else {
            System.out.println("x is not greater than 5");
        }


    }
}

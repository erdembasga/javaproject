package topics;

public class C72_TryCatch {

    public static void main(String[] args) {

        try {

            int number = 1/1;

            String str = null;
            str.trim();//NullPointerException


        }catch (ArithmeticException e){

            System.out.println(e.getMessage());

        } catch (NullPointerException e) {

            System.out.println(e.getMessage());

        }




    }
}

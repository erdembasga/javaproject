package topics;

public class C57_VarArgs {

    public static void main(String[] args) {

        int sum = addNumbers(6, 4, 10, 80);

        System.out.println(sum);

    }

    public static int addNumbers(int... numbers){

        int sum = 0;

        for (int w : numbers){

            sum += w;

        }




        return sum;

    }
}

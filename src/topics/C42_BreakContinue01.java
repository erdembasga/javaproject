package topics;

public class C42_BreakContinue01 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++){

            if (i==3){
                break;
            }

            System.out.print(i+" ");

        }

        System.out.println();

        for (int i = 1; i <= 5; i++){

            if (i==3){
                continue;
            }

            System.out.print(i+" ");

        }

        System.out.println("\n----------------");

        int num = 10;

        while (true){

            System.out.println(num);

            if (num==15){
                break;

            }

            num++;

        }

    }
}

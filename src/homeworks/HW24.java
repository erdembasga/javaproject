package homeworks;

public class HW24 {
//24: Write a Java program to print the following pyramid shape pattern:
/*
        *
       ***
      *****
     *******
 */
    public static void main(String[] args) {

        int n = 4;

        for (int i = 1; i <= n; i++){

            for (int j = 1; j <= n - i; j++){

                System.out.print(" ");
            }

            for (int j = 0; j < (i*2)-1; j++ ){
                System.out.print("*");
            }

            System.out.println();
        }




    }
}

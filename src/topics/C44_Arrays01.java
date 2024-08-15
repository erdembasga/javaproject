package topics;

import java.util.Arrays;

public class C44_Arrays01 {

    public static void main(String[] args) {

        int[] myArray;

        myArray = new int[5];

        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;
        myArray[3] = 40;
        myArray[4] = 50;


        int el4 = myArray[3];
        System.out.println(el4);


        System.out.println("For Loop:");
        for (int i=0; i< myArray.length; i++){
            System.out.println(myArray[i]);
        }

        int length = myArray.length;
        System.out.println("length = " + length);

        int[] numbers = {1, 2, 4, 7};

        System.out.println("--Numbers:--");
        for (int i=0; i<numbers.length; i++){

            System.out.println(numbers[i]);

        }




    }
}

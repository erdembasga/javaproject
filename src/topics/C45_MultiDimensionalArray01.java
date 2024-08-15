package topics;

import java.util.Arrays;

public class C45_MultiDimensionalArray01 {

    public static void main(String[] args) {

        int[][] multiArray = new int[3][4];

        multiArray[0][2] = 5;
        multiArray[1][1] = 25;

        int r1c3 = multiArray[0][2];
        int r2c2 = multiArray[1][1];
        System.out.println("r1c3 = " + r1c3);
        System.out.println("r2c2 = " + r2c2);

        int[][] intMultiArray = { {3, 6, 9}, {1, 4, 5}, {6, 3, 0}, {15, 3, 2} };

        intMultiArray[3][0] = 30;

        System.out.println(intMultiArray[3][0]);




    }
}

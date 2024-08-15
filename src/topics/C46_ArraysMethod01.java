package topics;


import java.util.Arrays;

public class C46_ArraysMethod01 {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
// printing the entire array using Arrays.toString()
        System.out.println(Arrays.toString(numbers));

// printing the entire array using Arrays.deepToString()
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(matrix));
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {5, 4, 3, 2, 1};
// comparing array1 and array2
        boolean isEqual1 = Arrays.equals(array1, array2);
        System.out.println("array1 equals array2: " + isEqual1);//true
// comparing array1 and array3
        boolean isEqual2 = Arrays.equals(array1, array3);
        System.out.println("array1 equals array3: " + isEqual2);//false


    }



}

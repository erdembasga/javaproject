package homeworks;

public class HW29 {
    //29: Create a method that prints pairs of array elements whose sums are equal to a given number.
 /*
   {4,6,5,-10,8,5,20} ===> 10
   4 + 6 = 10
   5 + 5 = 10
  -10 + 20 = 10
   */

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        findPairs(arr, 5);

    }

    public static void findPairs(int[] arr, int sum) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
                }

            }


        }


    }
}

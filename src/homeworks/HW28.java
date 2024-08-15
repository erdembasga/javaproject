package homeworks;

public class HW28 {
    //28: Create a method to check if an array is symmetric.

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 1};

        System.out.println(isSymmetric(arr1));


    }

    public static boolean isSymmetric(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {

            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }

        }

        return true;
    }
}

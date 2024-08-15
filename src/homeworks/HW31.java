package homeworks;

import java.util.Arrays;

public class HW31 {
    //31: Write code that prints the elements of an array without duplicates.

    public static void main(String[] args) {

        int[] arr = {20, 10, 20};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int idx = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[idx] = arr[i];
                idx++;
            }
        }


        arr[idx] = arr[arr.length - 1];
        idx++;//This is index, for the new capacity we will increase it.

        System.out.println(Arrays.toString(arr));

        int[] newArr = new int[idx];

        for (int i = 0; i < idx; i++) {

            newArr[i] = arr[i];

        }

        System.out.println("newArr = " + Arrays.toString(newArr));


    }
}

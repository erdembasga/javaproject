package practices.practice05;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_Arrays_MiddleElement {
/*
       Write code that finds the middle element in an integer array
       whose elements are taken from the user.
       Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
       (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
*/
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = scanner.nextInt();
    int[] arr = new int[size];

    for (int i = 0; i < size; i++) {
        System.out.println("Enter the element on index: " + i);
        arr[i] = scanner.nextInt();
    }

    System.out.println(Arrays.toString(arr));

    Arrays.sort(arr);

    System.out.println("Sorted Array: " + Arrays.toString(arr));
    int middleIdx = size / 2;

    if (size % 2 != 0) {//If the size is odd

        int middleElement = arr[middleIdx];

        System.out.println("middleElement = " + middleElement);

    } else {//If the size is even

        double middleElement = (arr[middleIdx] + arr[middleIdx - 1]) / 2.0;

        System.out.println("middleElement = " + middleElement);


    }

}

}

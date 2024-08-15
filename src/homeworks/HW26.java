package homeworks;

public class HW26 {
    //26: Write a code that prints the elements greater than the average of array elements.
    public static void main(String[] args) {

        int[] arr = {5, 9, 15, 1, 0, 11, 3};

        int sum = 0;


        for (int w : arr) {
            sum += w;
        }

        System.out.println("sum = " + sum);

        double average = (double) sum / arr.length;

        System.out.println("average = " + average);

        System.out.print("Elements greater than average: ");
        for (int w : arr) {

            if (w > average) {
                System.out.print(w + " ");
            }

        }
    }
}

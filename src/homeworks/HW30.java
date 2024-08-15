package homeworks;

public class HW30 {
    //30: Write a code that finds the 'minimum', 'maximum' and 'second maximum' values in an array.
    /*
        input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        output: min: -90, max: 10001, secMax: 8787
    */

    public static void main(String[] args) {

        int[] arr = {3, 2, 5, 0};

//        Arrays.sort(arr);
//        int min = arr[0];
//        int max = arr[arr.length-1];
//        int secMax = arr[arr.length-2];
//        System.out.println("Min: "+min+" Max: "+max+" SecMax: "+secMax);

        int min = arr[0];
        int max = arr[0];
        int secMax = arr[0];

        for (int w : arr) {

            if (w < min) {
                min = w;
            }else if (w > max) {
                secMax = max;
                max = w;
            } else if (w > secMax && w != max) {
                secMax = w;
            }

        }

        System.out.println("Min: " + min + " Max: " + max + " SecMax: " + secMax);


    }

}

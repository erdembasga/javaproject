package practices.practice05;

import java.util.Arrays;

public class Q02_Arrays_CharUsage {
/*
     Write a code that prints how many times each letter is used in the given String.

     Input: String str = "I love Java";
     Output: String strOutput = "I1 l1 o1 v2 e1 J1 a2";
*/

    public static void main(String[] args) {
        String str = "I love Java";
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));
        String result = "";



        for (String w : arr){
            int usage = 0;


            for (String u : arr){


                if (w.equals(u)){

                    usage++;
                }

            }
            if (!result.contains(w)){
                result += w+usage+" ";
            }


        }

        System.out.println("result = " + result);


    }


}

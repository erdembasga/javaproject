package topics;

import java.util.ArrayList;
import java.util.Arrays;

public class C49_ForEachLoop01 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList(
                "Apple", "Banana", "Orange", "Grapes", "Pineapple",
                "Mango", "Strawberry", "Blueberry", "Watermelon", "Peach"
        ));

        for (String w : list) {

            System.out.print(w + "! ");

        }

        int[] numbers = {1, 2, 3, 4, 5};

        for (int w : numbers){

            System.out.println(w * w);

        }



    }
}

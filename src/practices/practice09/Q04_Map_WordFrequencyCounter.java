package practices.practice09;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q04_Map_WordFrequencyCounter {
    //Find the number of occurrences of words in a sentence using a Map
    public static void main(String[] args) {

        String word = "Java is Java and Java is good";

        String[] wordsArray = word.split(" ");
        System.out.println(Arrays.toString(wordsArray));//[Java, is, Java, and, Java, is, good]
        Map<String, Integer> map = new HashMap<>();

        for (String w : wordsArray) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        System.out.println(map);

    }
}

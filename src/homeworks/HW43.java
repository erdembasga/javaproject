package homeworks;

import java.util.HashMap;
import java.util.Map;

public class HW43 {
    //43: Given a Map<String, Integer> representing the frequency of words in a text, write a method to return the most frequent word.
/*
    Map<String, Integer> wordCount = new HashMap<>();
    wordCount.put("hello", 5);
    wordCount.put("world", 3);
    wordCount.put("java", 7);
    wordCount.put("programming", 2);
 */
    public static void main(String[] args) {

        Map<String, Integer> wordCount = new HashMap<>();
        wordCount.put("hello", 5);
        wordCount.put("world", 3);
        wordCount.put("java", 7);
        wordCount.put("programming", 2);


        String result = mostFrequentWord(wordCount);
        System.out.println(result);


    }

    public static String mostFrequentWord(Map<String, Integer> map){

        int maxValue = 0;
        String mostFrequentWord = null;
        for (Map.Entry<String, Integer> w : map.entrySet()){

            if (w.getValue()>maxValue){
                maxValue = w.getValue();
                mostFrequentWord = w.getKey();
            }
        }

        return mostFrequentWord;
    }

}

package homeworks;

import java.util.HashMap;
import java.util.Map;

public class HW44 {
    //44: Write a method that merges two Map<String, Integer> objects by summing the values of the same keys.
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 3);
        map1.put("banana", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 4);
        map2.put("orange", 1);
        map2.put("apple", 1);

        Map<String, Integer> result = mergeMaps(map1, map2);
        System.out.println(result);

    }

    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {

        for (Map.Entry<String, Integer> w : map2.entrySet()) {

            int value = w.getValue();
            String key = w.getKey();

            if (map1.containsKey(key)) {
                map1.put(key, map1.get(key) + value);
            } else {
                map1.put(key, value);
            }

        }

        return map1;


    }
}

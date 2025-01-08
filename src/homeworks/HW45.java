package homeworks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HW45 {
    //45: Write a method to remove all entries from a Map<String, Integer> where the value is below a given threshold.
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("x", 5);
        map.put("y", 15);
        map.put("z", 10);

        System.out.println("Before Remove: " + map);
        removeBelow(map, 16);
        System.out.println("After Remove: " + map);


    }

    public static void removeBelow(Map<String, Integer> map, int threshold) {

        List<String> keysToRemove = new ArrayList<>();
        for (Map.Entry<String, Integer> w : map.entrySet()) {

            if (w.getValue() < threshold) {
                keysToRemove.add(w.getKey());
            }

        }

        for (String w : keysToRemove) {
            map.remove(w);
        }

    }
}

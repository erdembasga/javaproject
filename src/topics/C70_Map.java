package topics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class C70_Map {

    public static void main(String[] args) {

        Map<String, Integer> scores = new HashMap<>();

        scores.put("Zoey", 85);
        scores.put("Alice", 90);
        scores.put("Bob", 70);
        scores.put("Charlie", 80);

        System.out.println("scores = " + scores);

        for (Map.Entry<String, Integer> w: scores.entrySet()){

            System.out.println(w);
            System.out.println(w.getKey());
            System.out.println(w.getValue());

        }

        System.out.println(scores.get("Zoey"));
        System.out.println(scores.get("Bob"));

        System.out.println("scores.keySet() = " + scores.keySet());
        System.out.println("scores.keySet() = " + scores.values());

        System.out.println(scores.containsKey("Zoey"));
        System.out.println(scores.containsValue(90));


    }
}

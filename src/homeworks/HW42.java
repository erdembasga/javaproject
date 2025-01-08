package homeworks;

import java.util.HashMap;
import java.util.Map;

public class HW42 {
    //42: Write a method that calculates the average value of the entries in a Map<String, Integer>.
    public static void main(String[] args) {

        Map<String, Integer> peopleMap = new HashMap<>();
        peopleMap.put("John", 15);
        peopleMap.put("Mary", 14);
        peopleMap.put("Tom", 21);


        double average = calculateAverage(peopleMap);
        System.out.printf("average = %.2f", average);


    }

    public static double calculateAverage(Map<String, Integer> map) {

        if (map.isEmpty()){
            return 0;
        }

        int sum = 0;
        for (int w : map.values()) {
            sum += w;
        }

        return (double) sum / map.size();

    }
}

package practices.practice09;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Q02_Map_SumPruductPrices {
    /*
    Write a code to find the sum of prices in a map. (Use for-each loop)
    Example: {Belt=19.99, Shirt=29.99, Shoes=89.99, Sweater=24.99, Tie=19.99} ==> Total: 184.95
*/

    public static void main(String[] args) {

        Map<String, Double> productPrices = new HashMap<>();
        productPrices.put("Belt", 19.99);
        productPrices.put("Shirt", 29.99);
        productPrices.put("Shoes", 89.99);
        productPrices.put("Sweater", 24.99);
        productPrices.put("Tie", 19.99);

        System.out.println("productPrices = " + productPrices);

        Collection<Double> values = productPrices.values();
        double sum = 0;
        for (double w : values) {
            sum += w;
        }

        System.out.println("sum = " + sum);

    }
}

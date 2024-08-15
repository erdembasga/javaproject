package practices.practice09;

import java.util.HashMap;
import java.util.Map;

public class Q01_Map_FindKeyValue {
    // Print the names of the products with a price of 29.99 from the price list given below.
/*
        Map<String, Double> products = new HashMap<>();
        products.put("Belt", 19.99);
        products.put("Shirt", 29.99);
        products.put("Sweater", 24.99);
        products.put("Pajamas", 29.99);
        products.put("Shoes", 89.99);
        products.put("Tie", 19.99);
        products.put("Slippers", 29.99);
*/

    public static void main(String[] args) {

        Map<String, Double> products = new HashMap<>();
        products.put("Belt", 19.99);
        products.put("Shirt", 29.99);
        products.put("Sweater", 24.99);
        products.put("Pajamas", 29.99);
        products.put("Shoes", 89.99);
        products.put("Tie", 19.99);
        products.put("Slippers", 29.99);


        for (Map.Entry<String, Double> w : products.entrySet()) {
            if (w.getValue() == 29.99) {
                System.out.println(w.getKey());
            }
        }
    }
}

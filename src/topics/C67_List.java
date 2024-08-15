package topics;

import java.util.ArrayList;
import java.util.List;

public class C67_List {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Plum");
        fruits.add("a");
        fruits.add("b");
        fruits.add("c");
        fruits.add("d");

        System.out.println("fruits = " + fruits);

        System.out.println(fruits.get(1));//Banana

        fruits.remove("Banana");

        System.out.println("fruits after remove = " + fruits);

        fruits.remove(1);

        System.out.println("fruits after remove = " + fruits);

        for (String w : fruits){
            System.out.println(w);
        }




    }
}

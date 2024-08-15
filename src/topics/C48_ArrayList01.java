package topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class C48_ArrayList01 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Carrot");
        list.add("Broccoli");
        list.add("Tomato");

        list.add(3,"Cucumber");

        ArrayList<String> anotherList = new ArrayList<>();
        anotherList.add("Spinach");
        anotherList.add("Potato");

        list.addAll(anotherList);

        list.clear();

        boolean isEmpty = list.isEmpty();
        System.out.println("isEmpty = " + isEmpty);

        list.add("Apple");
        list.add("Carrot");
        list.add("Broccoli");
        list.add("Tomato");

        System.out.println(list.contains("Broccoli"));

        System.out.println(list.get(list.size()-1));

        System.out.println(list.indexOf("Apple"));

        list.remove("Carrot");
        //list.remove(0);

        Object[] arr = list.toArray();

        System.out.println("arr = " + Arrays.toString(arr));

        System.out.println(list.toString().toLowerCase());

        System.out.println(list);

// Creating an array of vegetables
        String[] vegetablesArray = {"Carrot", "Broccoli", "Tomato"};
// Converting array to ArrayList
        ArrayList<String> vegetablesList = new ArrayList<>(Arrays.asList(vegetablesArray));
// Displaying the ArrayList
        System.out.println("ArrayList of vegetables: " + vegetablesList);

        System.out.println(vegetablesList.get(1));





    }
}

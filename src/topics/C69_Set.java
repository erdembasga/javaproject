package topics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class C69_Set {

    public static void main(String[] args) {

        Set<String> names = new LinkedHashSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Alice");
        names.add("Zoey");

        System.out.println("names = " + names);


    }
}

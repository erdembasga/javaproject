package topics;

import java.util.LinkedList;

public class C68_LinkedList {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Tom");
        names.add("Brad");
        names.add("Jim");
        names.add("Angie");
        names.add("John");

        System.out.println("names = " + names);

        names.remove();

        names.remove("Jim");

        System.out.println("names = " + names);




    }
}

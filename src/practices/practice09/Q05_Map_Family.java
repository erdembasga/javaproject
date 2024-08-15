package practices.practice09;

public class Q05_Map_Family {
    //Type code to print family with name, age and siblings using map.

    public static void main(String[] args) {


        Family john = new Family("John","Doe",10,"Tom", "Mary", "Ken");
        System.out.println(john);

        Family mary = new Family("Mary", "Doe", 15, "Tom", "John", "Ken");
        System.out.println(mary);


    }
}

package homeworks;

public class HW32 {
    //32: Write a Java class named Market that models a market product with specific
    // attributes and constructors to initialize those attributes.
    public static void main(String[] args) {

        Market flour = new Market("Flour", 40,6);
        System.out.println(flour);
        Market nuts = new Market("Nuts", 150, 10);
        System.out.println(nuts);

        Market salt = new Market("Salt", 20);
        System.out.println(salt);

        Market honey = new Market("Honey", 200);
        System.out.println(honey);


    }
}

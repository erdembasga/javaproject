package topics;

public class C63_ObjectClass {

    public static void main(String[] args) {

        Object object = new Object();
        Object object1 = 12;
        Object object2 = "John";

        System.out.println((int) object1 + 8);
        System.out.println(((String) object2).charAt(0));

    }
}

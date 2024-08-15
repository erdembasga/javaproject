package topics;

public class C25_ContainsEndsWithStartsWith {

    public static void main(String[] args) {

        String str = "Hello World";
        boolean containsHello = str.contains("Hello");
        System.out.println("containsHello = " + containsHello);
        
        boolean containsFoo = str.contains("Foo");
        System.out.println("containsFoo = " + containsFoo);
        
        boolean endsWithWorld = str.endsWith("World");
        System.out.println("endsWithWorld = " + endsWithWorld);

        boolean endsWithJava = str.endsWith("Hello");
        System.out.println("endsWithJava = " + endsWithJava);

        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("startsWithHello = " + startsWithHello);
        
        boolean startsWithHi = str.startsWith("Hi");
        System.out.println("startsWithHi = " + startsWithHi);



    }



}

package topics;

public class C53_Scope {

    int age = 12;

    static String name = "John";

    public void method01(){

        int grade = 2;

    }




    public static void main(String[] args) {

        String address = "New York";

        System.out.println(name);

        C53_Scope obj = new C53_Scope();
        System.out.println("obj.age = " + obj.age);

        System.out.println(address);


    }
}

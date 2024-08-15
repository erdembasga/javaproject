package topics;

import another_package.Person;

public class C50_Constructor01 {

    public static void main(String[] args) {

        Person person1 = new Person("Paul", 15);

        System.out.println("person1.age = " + person1.age);
        System.out.println("person1.name = " + person1.name);

        Person person2 = new Person("Lisa", 7);
        System.out.println("person2.name = " + person2.name);
        System.out.println("person2.age = " + person2.age);

        Person person3 = new Person();
        System.out.println("person3.name = " + person3.name);
        System.out.println("person3.age = " + person3.age);


    }
}

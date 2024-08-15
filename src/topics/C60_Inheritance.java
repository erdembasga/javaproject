package topics;

import another_package.Cat;
import another_package.Dog;

public class C60_Inheritance {

    public static void main(String[] args) {

        Dog dog = new Dog(2);
        dog.name = "Buddy";
        dog.bark();
        dog.eat();


        System.out.println("dog.name = " + dog.name);


        System.out.println("-------------");
        Cat cat = new Cat(1);
        cat.name = "Whiskers";
        cat.meow();
        cat.eat();
        System.out.println("cat.name = " + cat.name);

    }

}

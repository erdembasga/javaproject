package topics;

import another_package.Animal;
import another_package.Cat;
import another_package.Dog;

public class C62_MethodOverriding {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.makeSound();

        Cat cat = new Cat();
        cat.makeSound();

        Animal cat2 = new Cat();
        cat2.makeSound();
        System.out.println(cat2.name);


    }
}

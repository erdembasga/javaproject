package another_package;

public class Cat extends Animal{

    public String name = "Cotton The Cat";

    public Cat(int age) {
        super(age);
    }

    public Cat(){

    }

    public void meow(){
        System.out.println(name+" meow");
    }


    public void makeSound(){
        System.out.println("Cats sounds meow");
    }
}

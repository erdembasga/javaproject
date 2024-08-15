package another_package;

public class Animal {

    public Animal(int age){

        System.out.println("Animal age is: "+age);

    }

    public Animal(){

    }


    public String name = "Animals";

    public void eat() {
        System.out.println(name + " eat");
    }

    public void makeSound(){

        System.out.println("Some generic sound");

    }
}

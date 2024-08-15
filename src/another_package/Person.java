package another_package;

public class Person {

    public String name;
    public int age;

    public Person(String nameParam, int ageParam){

        name = nameParam;
        age =ageParam;

    }

    public Person(){

        name = "NoName";
        age = 5;

    }

    {

        System.out.println("Object Created!");

    }


}

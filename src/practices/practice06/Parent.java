package practices.practice06;

public class Parent {
    String name;
    int age;
    boolean isDonated;

    public Parent(String name, int age, boolean isDonated) {
        this.name = name;
        this.age = age;
        this.isDonated = isDonated;
    }


    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isDonated=" + isDonated +
                '}';
    }
}

package homeworks;

import java.util.ArrayList;

public class Teacher extends Person {
    String id;
    ArrayList<String> lessons;

    public Teacher(String name, int age, String id, ArrayList<String> lessons) {
        super(name, age);
        this.id = id;
        this.lessons = lessons;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<String> getLessons() {
        return lessons;
    }

    public void setLessons(ArrayList<String> lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", lessons=" + lessons +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

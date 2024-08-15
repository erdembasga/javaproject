package homeworks;

import java.util.ArrayList;

public class Student extends Person{
    String id;
    ArrayList<String> courses;

    public Student(String name, int age, String id, ArrayList<String> courses) {
        super(name, age);
        this.id = id;
        this.courses = courses;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", courses=" + courses +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

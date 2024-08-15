package practices.practice06;

import java.util.ArrayList;

public class Student {
    String firstname;
    String lastname;
    int age;
    int grade;
    String id;
    Parent parent;
    ArrayList<Book> books;

    public Student(String firstname, String lastname, int age, int grade, Parent parent, ArrayList<Book> books) {
        this.grade = grade;
        this.age = age;
        this.lastname = lastname;
        this.firstname = firstname;
        this.id = ""+grade+age+firstname.charAt(0)+lastname.charAt(0);
        this.parent = parent;
        this.books = books;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", id='" + id + '\'' +
                ", parent=" + parent +
                ", books=" + books +
                '}';
    }
}

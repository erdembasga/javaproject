package topics;

import another_package.Student;

public class C51_StaticKeyword01 {

    public static void main(String[] args) {

        Student student1 = new Student("John", 10, 5);
        System.out.println("student1.name = " + student1.name);
        System.out.println("student1.age = " + student1.age);
        System.out.println("student1.grade = " + student1.grade);

        Student student2 = new Student("Mary", 7, 1);
        System.out.println("student2.name = " + student2.name);
        System.out.println("student2.age = " + student2.age);
        System.out.println("student2.grade = " + student2.grade);

        System.out.println("student1.name = " + student1.name);
        System.out.println("student1.age = " + student1.age);
        System.out.println("student1.grade = " + student1.grade);

        Student student3 = new Student("Tom", 9, 3);

        System.out.println("student1.numOfStudent = " + student1.numOfStudent);
        System.out.println("student2.numOfStudent = " + student2.numOfStudent);
        System.out.println("Student.numOfStudent = " + Student.numOfStudent);


    }
}

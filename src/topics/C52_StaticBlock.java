package topics;

import another_package.Student;

public class C52_StaticBlock {

    public static void main(String[] args) {

        int numOfStudents = Student.numOfStudent;

        System.out.println("numOfStudents = " + numOfStudents);

        Student student = new Student("John", 10, 4);


    }
}

package another_package;

public class Student {

    public String name;
    public int age;
    public int grade;
    public static int numOfStudent;

    public  Student(String nameParam, int ageParam, int gradeParam){

        name = nameParam;
        age = ageParam;
        grade = gradeParam;
        numOfStudent++;

    }

    static {

        System.out.println("Welcome to Student Class");

    }

    {
        System.out.println("You created an object from Student class");
    }

}

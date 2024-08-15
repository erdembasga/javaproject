package topics;

import another_package.Employee;

public class C58_Encapsulation {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Tom", 30);

        employee1.setName("John");

        String name = employee1.getName();
        System.out.println("name = " + name);

        employee1.setAge(35);

        int age = employee1.getAge();
        System.out.println("age = " + age);

        System.out.println(employee1);

        Employee employee2 = new Employee("Mary", 25);
        System.out.println("employee2 = " + employee2);

        employee2.setAge(28);

        System.out.println(employee2.getName());
        System.out.println(employee2.getAge());



    }
}

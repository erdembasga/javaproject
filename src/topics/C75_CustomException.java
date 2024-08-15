package topics;

import another_package.CustomException;

public class C75_CustomException {

    public static void main(String[] args) {

        System.out.println(age(20));

    }

    public static int age(int age) {

        if (age<18){

            try {
                throw new CustomException("Age should be greater than 18");
            } catch (CustomException e) {
                throw new RuntimeException(e);
            }

        }

        return age;

    }

}

package practices.practice07;

public class Q03_MethodOverloading_SumOfNumbers {
    //Write a method that returns the sum of the digits of an integer. Also, create another method that performs the same operation with a parameter received as a string.
    public static void main(String[] args) {

        int intSum = sumOfDigits(465);
        System.out.println("intSum = " + intSum);

        int strSum = sumOfDigits("456");
        System.out.println("strSum = " + strSum);



    }

    public static int sumOfDigits(int number) {

        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10; //number = number / 10
        }

        return sum;
    }

    public static int sumOfDigits(String number){

        int sum = 0;

        for (int i=0; i<number.length(); i++){
            sum += Integer.parseInt(number.charAt(i)+"");
        }

        return sum;
    }
}

package practices.practice01;

public class Q03_Average {

    /*
    double num1 = 23.4;
    double num2 = 24.0;
    double num3 = 12;
    double num4 = 450.3;
    double num5 = 23000;

    Write a code to calculate the average of these numbers.
*/

    public static void main(String[] args) {

        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;

        double sum = num1 + num2 + num3 + num4 + num5;
        double average = sum / 5;

        System.out.println("average = " + average);


    }
}

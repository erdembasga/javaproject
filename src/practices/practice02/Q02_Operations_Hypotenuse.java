package practices.practice02;

public class Q02_Operations_Hypotenuse {
    //Write a code that calculates the hypotenuse

    public static void main(String[] args) {

        double a = 3;//leg01 -> the first leg of right triangle
        double b = 4;//leg02 -> the second leg of right triangle

        double sumOfLegsSquare = a*a+ b*b;
        double result = Math.sqrt(sumOfLegsSquare);
        System.out.println("Hypotenus = " + result);

    }
}

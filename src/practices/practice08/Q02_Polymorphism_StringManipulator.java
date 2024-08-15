package practices.practice08;

public class Q02_Polymorphism_StringManipulator {
        /*
    Create a Java program that demonstrates polymorphism:
        - Define a superclass StringManipulator.
        - Create two subclasses: UpperCaseConverter and LowerCaseConverter.
        - Each subclass should override a method manipulate(String input) from the StringManipulator class.
        - Write a main method:
        - Create objects of UpperCaseConverter and LowerCaseConverter.
        - Call their manipulate() methods using a reference of type StringManipulator.
*/

    public static void main(String[] args) {

        StringManipulator upperCaseConverter = new UpperCaseConverter();
        StringManipulator lowerCaseConverter = new LowerCaseConverter();

        String word = "Hello World";

        String upperCase = upperCaseConverter.manipulate(word);
        System.out.println("upperCase = " + upperCase);

        String lowerCase = lowerCaseConverter.manipulate(word);
        System.out.println("lowerCase = " + lowerCase);


    }
}

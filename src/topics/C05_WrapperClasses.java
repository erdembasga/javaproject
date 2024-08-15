package topics;

public class C05_WrapperClasses {

    public static void main(String[] args) {

        // Create an Integer object
        Integer num1 = 10;


        // Retrieve the primitive value
        int value1 = num1.intValue();
        System.out.println("value1 = " + value1);


        // Parsing a string to produce an integer
        String strNumber = "20";
        int parsedValue = Integer.parseInt(strNumber);
        System.out.println(parsedValue+5);

        // Create a Double object
        Double num2 = 3.14;


        // Convert to string
        String stringValue = num2.toString();
        System.out.println("stringValue = " + (stringValue+ 0.06));


        // Compare two Integer objects
        Integer num3 = 15;
        int compareResult = num1.compareTo(num3);
        System.out.println("compareResult = " + compareResult);

        // Check equality of two Integer objects
        boolean isEqual = num1.equals(num3);
        System.out.println("isEqual = " + isEqual);

        // Check nullabilty of a Character Object
        Character c = null;
        System.out.println("c = " + c);


    }




}

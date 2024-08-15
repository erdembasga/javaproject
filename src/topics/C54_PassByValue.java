package topics;

public class C54_PassByValue {

    public static void main(String[] args) {
        //Creating a String object with the value "John"
        String name = "John";

        //Calling the modifyValue method and passing the String object
        modifyValue(name);

        //Printing the value of the string object after modification
        System.out.println("name outside of the method = " + name);
    }

    //Method to modify the string object
    public static void modifyValue(String name){
        //Appending " Dou " to the String object
        name = name.concat(" Doe");

        //Printing the value of the string object after modification
        System.out.println("name in the method = " + name);
    }
}

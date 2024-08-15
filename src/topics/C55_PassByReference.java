package topics;

public class C55_PassByReference {

    public static void main(String[] args) {
        //Creating a StringBuilder object with the value "John"
        StringBuilder name = new StringBuilder("John");

        System.out.println("name = " + name);

        //Calling the modifyValue method and passing the StringBuilder object
        modifyValue(name);

        //Printing the value of the StringBuilder object after modification
        System.out.println("original name = " + name);//Output: name = John Doe
    }


    //Method to modify the StringBuilder object
    public static void modifyValue(StringBuilder name){
        //Appending " Doe" to the StringBuilder object
        name.append(" Doe");

        //Printing the value of the StringBuilder object after modification
        System.out.println("name in method = " + name);//Output: name = John Doe
    }
}

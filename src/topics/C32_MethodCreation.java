package topics;

public class C32_MethodCreation {
    public static void main(String[] args) {

        System.out.println(fullName("    jOhN dOe    "));

    }

    public static String fullName(String fullName){

        String trimmedFullName =  fullName.trim().toLowerCase();
        char firstChar =  trimmedFullName.toUpperCase().charAt(0);
        String firstName = firstChar + trimmedFullName.substring(1, trimmedFullName.indexOf(" "));

        String lastname = trimmedFullName.substring(trimmedFullName.indexOf(" ")+1).toUpperCase();


        return firstName + " " + lastname;

    }
}

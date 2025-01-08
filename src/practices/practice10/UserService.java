package practices.practice10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
    Scanner scanner = new Scanner(System.in);
    List<User> userList = new ArrayList<>();

    public void register() {
        String name;
        do {
            System.out.println("Enter name:");
            name = scanner.nextLine();
        } while (!validateName(name));

        String username;
        do {
            System.out.println("Enter username:");
            username = scanner.nextLine();
        } while (isUsernameExist(username));

        String email;
        do {
            System.out.println("Enter email:");
            email = scanner.nextLine();
        } while (!validateEmail(email) || isEmailExist(email));

        String password;
        do {
            System.out.println("Enter password:");
            password = scanner.nextLine();
        }while (!validatePassword(password));


        User user = new User(name, username, email, password);
        userList.add(user);
        System.out.println(userList);

    }

    int counter;

    public void login() {

        System.out.println("Enter username or email");
        String usernameOrPassword = scanner.nextLine();

        System.out.println("Enter password");
        String password = scanner.nextLine();

        boolean isLoggedin = false;

        for (User user : userList) {

            if ((user.username.equals(usernameOrPassword) || user.email.equals(usernameOrPassword)) && user.password.equals(password)) {
                System.out.println("You have logged in. Welcome!!!");
                isLoggedin = true;
                break;
            }

        }

        if (!isLoggedin) {
            counter++;
            System.out.println("Incorrect password or username. Try again!");

            if (counter == 3) {
                System.err.println("Blocked!!!");
                System.exit(0);
            }

            login();
        }


    }

    public boolean validateName(String name) {

        boolean isNameValid = name.replaceAll("[a-zA-z]", "").isEmpty();

        if (!isNameValid) {
            System.out.println("Name can contain only letters.");
        }

        return isNameValid;
    }

    public boolean isUsernameExist(String username) {

        for (User user : userList) {

            if (user.username.equals(username)) {
                System.out.println("This username already exists. Try another one!");
                return true;
            }

        }
        return false;
    }

    public boolean isEmailExist(String email) {

        for (User user : userList) {

            if (user.email.equals(email)) {
                System.out.println("This email already exists. Try another one!");
                return true;
            }

        }
        return false;
    }

    /*
    The validateEmail method ensures the email has no spaces, contains an @ symbol, and ends with gmail.com, hotmail.com, or yahoo.com.
    It also ensures that the username part (before @) contains only valid characters.
    john@gmail.com
    */
    public boolean validateEmail(String email){

        boolean isSpace = !email.contains(" ");
        if (!isSpace){
            System.out.println("Email can not contain space");
        }

        boolean isAt = email.contains("@");
        if (!isAt){
            System.out.println("Email should contain @ sign");
        }

        boolean isEndTrue = email.endsWith("gmail.com") || email.endsWith("hotmail.com") || email.endsWith("yahoo.com");
        if (!isEndTrue){
            System.out.println("Email should end with gmail.com, hotmail.com, or yahoo.com.");
        }

        boolean isUsernameValid = email.split("@")[0].replaceAll("[a-zA-Z0-9-_.]", "").isEmpty();
        if (!isUsernameValid){
            System.out.println("Username has invalid character");
        }

        return isSpace && isAt && isEndTrue && isUsernameValid;

    }

    /*
    The validatePassword method ensures the password has no spaces, is at least 6 characters long, and contains at least one uppercase letter,
    one lowercase letter, one digit, and one symbol.
     */

    public boolean validatePassword(String password){

        boolean isSpace = !password.contains(" ");
        if (!isSpace){
            System.out.println("Password can not contain space");
        }
        boolean isLengthGT6 = password.length()>5;
        if (!isLengthGT6){
            System.out.println("Password should be least 6 characters long");
        }
        boolean isUpperCase = !password.replaceAll("[^A-Z]", "").isEmpty();
        if (!isUpperCase){
            System.out.println("Password should contain at least one uppercase letter");
        }

        boolean isLowerCase = !password.replaceAll("[^a-z]", "").isEmpty();
        if (!isLowerCase){
            System.out.println("Password should contain at least one lowercase letter");
        }

        boolean isDigit = !password.replaceAll("[^0-9]", "").isEmpty();
        if (!isDigit){
            System.out.println("Password should contain at least one digit");
        }

        boolean isSymbol = !password.replaceAll("\\P{Punct}", "").isEmpty();
        if (!isSymbol){
            System.out.println("Password should contain at least one symbol");
        }

        return isSpace && isLengthGT6 && isUpperCase && isLowerCase && isDigit && isSymbol;

    }

}

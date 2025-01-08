package practices.practice10;

import java.util.Scanner;

public class HomePage {
   /* Mini Project:
Create a registration and login system with specific validation rules for email and password. The system displays a menu, handles user input, and ensures that usernames and emails are unique.
Below is a summary of how each part of the code fulfills the task requirements:
Task Breakdown:
Menu Display:
The start method in the HomePage class displays a menu that allows users to choose between registering, logging in, or exiting.
The showMenu method presents the options to the user.
Registration:
The register method in the UserService class collects user information: name, username, email, and password.
It checks for the uniqueness of the username and email using the isUsernameExists and isEmailExists methods.
The method validates the email format and password strength using validateEmail and validatePassword methods, respectively.
After successful validation, the user information is stored in a User object, which is then added to the userList.
Login:
The login method in the UserService class allows users to log in by entering their username or email and password.
It checks if the entered username/email exists and whether the password matches the one registered.
If the credentials are correct, the user is logged in; otherwise, an error message is displayed.
Email Validation:
The validateEmail method ensures the email has no spaces, contains an @ symbol, and ends with gmail.com, hotmail.com, or yahoo.com.
It also ensures that the username part (before @) contains only valid characters.
Password Validation:
The validatePassword method ensures the password has no spaces, is at least 6 characters long, and contains at least one uppercase letter, one lowercase letter, one digit, and one symbol.
    */
   public static void main(String[] args) {

      start();

   }


   public static void start() {
      Scanner scanner = new Scanner(System.in);
      UserService userService = new UserService();

      int option = 0;

      do {
         showMenu();
         try {
            option = scanner.nextInt();
         } catch (Exception e) {
            scanner.next();//Clear the invalid input
         }
         switch (option) {
            case 1:
               userService.register();
               break;
            case 2:
               userService.login();
               break;
            case 3:
               System.out.println("We wish you a good day! Bye!");
               break;
            default:
               System.out.println("Invalid input! Try again.");
               showMenu();
               break;

         }
      } while (option != 3);


   }

   public static void showMenu() {

      System.out.println("Welcome to Mini Project:");
      System.out.println("1-Register");
      System.out.println("2-Login");
      System.out.println("3-Exit");

   }


}

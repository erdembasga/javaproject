package homeworks;

import java.util.ArrayList;
import java.util.Scanner;

public class HW33 {
    //33: Write a code that adds a number received from the user to a list,
    // removes it from the list, or updates an existing element with that number.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true){
            System.out.println("""
                    Enter 'add' to add element
                    Enter 'set' to update element
                    Enter 'remove' to delete element
                    Enter quit' to exit.""");

            String option = scanner.next();

            if (option.equalsIgnoreCase("add")){
                System.out.println("Enter the number to add");
                numbers.add(scanner.nextInt());
                System.err.println(numbers);
            } else if (option.equalsIgnoreCase("set")) {
                System.out.println("Enter the number you want to update");
                int numberToUpdate = scanner.nextInt();
                System.out.println("Enter the new number to replace with");
                numbers.set(numbers.indexOf(numberToUpdate), scanner.nextInt());
                System.err.println(numbers);
            } else if (option.equalsIgnoreCase("remove")) {
                System.out.println("Enter the number you want to remove");
                numbers.remove((Integer) scanner.nextInt());
                System.err.println(numbers);
            } else if (option.equalsIgnoreCase("quit")){
                System.err.println(numbers);
                break;
            } else {
                System.err.println("Enter a valid input");
            }

        }

        System.out.println("GOOD BYE!");




    }

}

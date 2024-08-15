package topics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C80_Lambda {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Aaron");
        System.out.println("names = " + names);

        List<String> filteredList = names.stream().filter(eachName -> eachName.startsWith("A")).collect(Collectors.toList());
        System.out.println("filteredList = " + filteredList);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 10);
        List<Integer> mappedNumbers = numbers.stream().map(number -> number * number).collect(Collectors.toList());
        System.out.println("mappedNumbers = " + mappedNumbers);

        List<String> fruits = Arrays.asList("Orange", "Banana", "Mango", "Apple");
        fruits.sort((fruit1, fruit2) -> fruit1.compareTo(fruit2) );
        System.out.println("fruits = " + fruits);

        // Creating a list of integers
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10, 12);
        // Using stream(), filter(), map(), and distinct() methods
        numbersList.stream()
                .filter(num -> num % 2 == 0) // Keep only even numbers
                .map(num -> num * num) // Square each even number
                .distinct() // Remove duplicates
                .forEach(System.out::println); // Print each result

        // Creating a list of integers
        List<Integer> numbersSort = Arrays.asList();
        // sorted() - Sorting the elements of the list
        List<Integer> sortedList = numbersSort.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("sortedList = " + sortedList);

        // findAny() - Finding any element in the list
        Optional<Integer> anyElement = numbersSort.stream()
                .findAny();

        if (anyElement.isPresent()) {
            System.out.println("Any Element: " + anyElement.get());
        } else {
            System.out.println("No elements found!");
        }

        // Using rangeClosed() method to generate a stream of integers from 1 to 5 (inclusive)
        IntStream.rangeClosed(1, 5)
                .map(t-> t*5)
                .forEach(System.out::println);

        // Using range() method to generate a stream of integers from 1 to 4 (exclusive)
        IntStream.range(1, 5)
                .forEach(System.out::println);


    }
}

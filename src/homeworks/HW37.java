package homeworks;

public class HW37 {
    //37: Create methods named transform. These methods should perform the following tasks:
/*
    Reverse a given string.
    Convert all characters of a given string to uppercase.
    Convert all characters of a given string to lowercase.
    Replace all occurrences of a given character in a string with another character.
    Replace all occurrences of a given substring in a string with another substring.
    Concatenate two strings and reverse the result.
    Concatenate three strings and convert the result to uppercase.
*/
    public static void main(String[] args) {

        System.out.println(transform("Hello", false));
        System.out.println(transform("Hello"));
        System.out.println(transform("Hello", 'l', '|'));
        System.out.println(transform("HelloWorld", "lo", "*"));
        System.out.println(transform("Hello", "World"));
        System.out.println(transform("Hello", "World", "Hi", false));


    }

    //Reverse a given string.
    static String transform(String word) {

        return new StringBuilder(word).reverse().toString();
    }

    //Convert all characters of a given string to uppercase.
    //Convert all characters of a given string to lowercase.
    static String transform(String word, boolean isUpperCase) {

        if (isUpperCase == true) {
            return word.toUpperCase();
        } else {
            return word.toLowerCase();
        }

    }

    //Replace all occurrences of a given character in a string with another character.
    static String transform(String word, char oldChar, char newChar) {

        return word.replace(oldChar, newChar);
    }

    //Replace all occurrences of a given substring in a string with another substring.
    static String transform(String word, String oldSubString, String newSubString) {

        return word.replace(oldSubString, newSubString);
    }


    //Concatenate two strings and reverse the result.
    static String transform(String word1, String word2) {

        return new StringBuilder(word1 + word2).reverse().toString();
    }

    //Concatenate three strings and convert the result to uppercase.
    static String transform(String word1, String word2, String word3, boolean isUpperCase) {

        if (isUpperCase) {
            return (word1 + word2 + word3).toUpperCase();
        } else {
            return (word1 + word2 + word3);
        }

    }

}

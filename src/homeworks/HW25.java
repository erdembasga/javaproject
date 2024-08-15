package homeworks;

import java.util.Arrays;

public class HW25 {
    //25: Create a method that checks whether two words are "Anagrams."

/*
    - Anagram is forming a new word using the characters of another word. -
    Example:
    * listen <> silent.
    * evil <> live.
    * dormitory <> dirty room.
    * the eyes <> they see.
    * conversation <> voices rant on.
    * astronomer <> moon starer.
*/

    public static void main(String[] args) {

        System.out.println(isAnagram("astronomer", " moon starer."));

    }

    public static boolean isAnagram(String str1, String str2) {

        String[] arr1 = str1.trim().toLowerCase().replaceAll("[^A-z]", "").split("");
        String[] arr2 = str2.trim().toLowerCase().replaceAll("[^A-z]", "").split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            return true;
        } else {
            return false;
        }

    }

}

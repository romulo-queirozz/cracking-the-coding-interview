package datastructure.array_and_strings;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {


    public static void main(String[] args) {
        var input = "tacocat";
        System.out.println(answer(input));
    }

    // Given a string, write a function to check if it is a permutation of a palindrome.
    // A palindrome is a word or phrase that is the same forwards and backwards. A
    private static boolean answer(String phrase) {
        phrase = phrase.toLowerCase().replaceAll(" ", "");

        Map<Character, Integer> freq = new HashMap<>();

        for (char c : phrase.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;
        for (int count : freq.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount <= 1;
    }
}



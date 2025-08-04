package datastructure.array_and_strings;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question01 {


    public static void main(String[] args) {
        var input = "aa";
        System.out.println(answer01(input));
        System.out.println(answer02(input));
    }

    //  Implement an algorithm to determine if a string has all unique characters.
    private static boolean answer01(String input) {
        var check = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            if(check.contains(input.charAt(i))) {
                return false;
            }
            check.add(input.charAt(i));
        }
        return true;
    }

    // What if you cannot use additional data structures.
    private static boolean answer02(String input) {
        var sorted = input.toCharArray();
        Arrays.sort(sorted);

        for (int i = 0; i < input.length(); i++) {
            if(i > 0) {
                if (sorted[i - 1] == sorted[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}

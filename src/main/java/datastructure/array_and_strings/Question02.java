package datastructure.array_and_strings;

import java.util.Arrays;

public class Question02 {
    public static void main(String[] args) {
        var input01 = "caa";
        var input02 = "aac";

        System.out.println(answer(input01, input02));
    }

    // Check Permutation
    private static boolean answer(String input01, String input02) {
        var array01 = input01.toCharArray();
        var array02 = input02.toCharArray();

        Arrays.sort(array01);
        Arrays.sort(array02);

        return Arrays.equals(array01, array02);
    }
}

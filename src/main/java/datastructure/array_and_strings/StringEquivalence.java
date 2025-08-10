package datastructure.array_and_strings;

import java.util.Stack;

public class StringEquivalence {

//    Given two strings s and t, where the character '#' represents a backspace (deletes the previous character if it exists),
//    determine if the two strings result in the same final content after applying all backspaces.
    public static void main(String[] args) {
        var s = "ab#c";
        var t = "ad#c";
        System.out.println(answer(s, t));
    }

    public static boolean answer(String s, String t) {

        var stack01 = new Stack<String>();
        for (var a : s.toCharArray()) {
            if(String.valueOf(a).equals("#")) {
                stack01.pop();
            } else {
                stack01.add(String.valueOf(a));
            }
        }

        var stack02 = new Stack<String>();
        for (var a : t.toCharArray()) {
            if(String.valueOf(a).equals("#")) {
                stack02.pop();
            } else {
                stack02.add(String.valueOf(a));
            }
        }

        return stack01.equals(stack02);
    }


}

package datastructure.array_and_strings;

public class Question03 {
    public static void main(String[] args) {
        var input = "Hi Hi Hi";
        System.out.println(answer(input));
    }


    // Write a method to replace all spaces in a string with '%20'. You may assume that the string
    private static String answer(String input) {
        var list = input.toCharArray();
        var s = new StringBuilder();
        for (char c : list) {
            if (c == ' ') {
                s.append("%20");
            } else {
                s.append(c);
            }
        }

        return s.toString();
    }
}

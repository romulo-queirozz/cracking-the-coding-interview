package datastructure.array_and_strings;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
    }

    public static boolean isValid(String input) {
        var inputArray = input.toCharArray();
        var stack = new Stack<String>();

        for (char c : inputArray) {
            var a = String.valueOf(c);
            if (
                    a.equals("{") ||
                            a.equals("(") ||
                            a.equals("[")
            ) {
                stack.add(a);
                continue;
            }

            switch (a) {
                case "}":
                    if (stack.isEmpty() || !stack.lastElement().equals("{")) return false;
                    stack.pop();
                    break;
                case ")":
                    if (stack.isEmpty() || !stack.lastElement().equals("(")) return false;
                    stack.pop();
                    break;
                case "]":
                    if (stack.isEmpty() || !stack.lastElement().equals("[")) return false;
                    stack.pop();
                    break;
            }
        }
        return stack.isEmpty();
    }
}

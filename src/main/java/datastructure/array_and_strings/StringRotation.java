package datastructure.array_and_strings;

public class StringRotation {

    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle", "erbottlewat"));
        System.out.println(isRotation("aaaab", "aabaa"));
    }

    //    String Rotation:Assume you have a method isSubstringwhich checks if oneword is a substring
    //    of another. Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one
    //    call to isSubstring (e.g., "waterbottle" is a rotation of"erbottlewat").
    static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length() || s1.isEmpty()) return false;
        String s1s1 = s1 + s1;
        return isSubstring(s2, s1s1);
    }

    static boolean isSubstring(String small, String large) {
        if (small.length() > large.length()) return false;

        for (int i = 0; i <= large.length() - small.length(); i++) {
            int j;
            for (j = 0; j < small.length(); j++) {
                if (large.charAt(i + j) != small.charAt(j)) {
                    break;
                }
            }
            if (j == small.length()) return true;
        }

        return false;
    }
}

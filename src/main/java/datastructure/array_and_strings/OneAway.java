package datastructure.array_and_strings;

public class OneAway {

    public static void main(String[] args) {
        System.out.println(answer("pale", "pxle"));  // true
        System.out.println(answer("pale", "ple"));   // true
        System.out.println(answer("pales", "pale")); // true
        System.out.println(answer("pale", "bale"));  // true
        System.out.println(answer("pale", "bae"));   // false
    }

//    One Away: There are three types of edits that can be performed on strings: insert a character,
//    remove a character, or replace a character. Given two strings, write a function to check if they are
//    one edit (or zero edits) away.
    private static boolean answer(String s1, String s2) {
        if (Math.abs(s1.length() - s2.length()) > 1) return false;

        // s1 should always be the shorter string
        String shorter = s1.length() < s2.length() ? s1 : s2;
        String longer = s1.length() < s2.length() ? s2 : s1;

        int index1 = 0;
        int index2 = 0;
        boolean foundDifference = false;

        while (index1 < shorter.length() && index2 < longer.length()) {
            if (shorter.charAt(index1) != longer.charAt(index2)) {
                if (foundDifference) return false;
                foundDifference = true;

                // If lengths are the same, move both pointers
                if (shorter.length() == longer.length()) {
                    index1++;
                }
            } else {
                index1++; // Characters match, move pointer in shorter string
            }
            index2++; // Always move pointer in longer string
        }

        return true;
    }
}
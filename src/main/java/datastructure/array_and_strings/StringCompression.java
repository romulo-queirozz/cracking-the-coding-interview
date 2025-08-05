package datastructure.array_and_strings;

public class StringCompression {

    public static void main(String[] args) {
        System.out.println(answer("aabcccccaaa"));
    }

    //Implement a method to perform basic string compression using the counts
    //of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
    //"compressed" string would not become smaller than the original string, your method should return
    //the original string. You can assume the string has only uppercase and lowercase letters (a - z).

    public static String answer(String value) {
        if (value == null || value.isEmpty()) return value;

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < value.length(); i++) {
            if (value.charAt(i) == value.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(value.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        // Append the last character and its count
        compressed.append(value.charAt(value.length() - 1)).append(count);

        return compressed.length() < value.length() ? compressed.toString() : value;
    }

}

package datastructure.array_and_strings;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Question06 {

    public static void main(String[] args) {
        System.out.println(answer("aabbcc"));
    }

    //Implement a method to perform basic string compression using the counts
    //of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
    //"compressed" string would not become smaller than the original string, your method should return
    //the original string. You can assume the string has only uppercase and lowercase letters (a - z).
    public static String answer(String value) {
        var input = value.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .toList();

        var output = new LinkedList<String>();
        output.add(input.getFirst());


        var count = new LinkedList<String>();
        var c = 0;


        for (var i = 0; i < value.length(); i++) {
            if(!output.isEmpty()) {
                if (!Objects.equals(output.getLast(), input.get(i))) {
                    System.out.println(c);
                    output.add(input.get(i));
                    c++;
                } else {
                    c = 0;
                }
            }
        }


        return String.join("", output);
    }
}

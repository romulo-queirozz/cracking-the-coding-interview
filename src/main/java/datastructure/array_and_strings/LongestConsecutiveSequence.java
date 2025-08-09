package datastructure.array_and_strings;

import java.util.*;

public class LongestConsecutiveSequence {

    static public void main(String[] args) {
        var input = new ArrayList<>(Arrays.asList(100, 4, 200, 1, 3, 2));
        longestConsecutive(input);
    }

    public static void longestConsecutive(ArrayList<Integer> nums) {

        var hash = new HashSet<>(nums.stream().toList());
        var arraySize = nums.size();
        var result = new ArrayList<Integer>();

        for (var num : nums) {
            if (hash.contains(num - 1)) continue;
            var end = false;
            var count = 1;
            var ref = num + 1;
            while (!end) {
                if(hash.contains(ref)) {
                    count++;
                    ref++;
                } else {
                    end = true;
                }
            }
            result.add(count);
            if(count > arraySize / 2) {
                break;
            }
        }
        System.out.println(result.stream().max(Integer::compareTo).get());
    }
}

package datastructure.array_and_strings;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        var input = new int[]{2, 7, 11, 15};
        var target = 18;
        System.out.println(Arrays.toString(answer(input, target)));
    }

    public static int[] answer(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            var diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }

        return new int[] {};
    }
}

package com.deepak.blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int target = 19;
        int[] nums = {16,4,23,8,15,42,1,2};
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[]{i, map.get(complement)};
            }

            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution");
    }
}

package com.deepak.blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum_15 {
    public static void main(String[] args) {
        int[] nums  = {-1, 0, 1, 2, -1, -4, 5};
        List<List<Integer>> result = threeSum(nums);
        System.out.println(result);
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        if (nums == null ||
                nums.length < 3)
            return new ArrayList<>();


        Arrays.sort(nums);
        Set<List<Integer>> resultSet = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i+1;
            int right = nums.length-1;

            while (left < right) {
                int sum  = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    resultSet.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    right--;
                    left++;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(resultSet);
    }
}

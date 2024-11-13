package com.leetcode.questions;

public class Max_Consecutive_Ones_3_1004 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        System.out.println("The longest ones = " + longestOnes(nums, k));
    }

    private static int longestOnes(int[] nums, int k) {
        int maxArray = 0;
        int left = 0;
        int length = nums.length;
        for (int right = 0; right < length; right++) {
            if (nums[right] == 0) {
                k--;
            }

            while (k < 0) {
                if (nums[left] == 0) {
                    k = k + 1;
                }
                left++;
            }
            maxArray = Math.max(maxArray, right - left + 1);
        }

        return maxArray;
    }
}

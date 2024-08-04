package com.leetcode.questions;

public class Maximum_Average_SubArray_1_643 {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println("The max avg is " + findMaxAverage(nums, k));
    }

    private static double findMaxAverage(int[] nums, int k) {
        int max = 0;
        int sum = 0;
        int n = nums.length;

        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }
        max = sum;
        for (int i = k; i < n; i++) {
            sum = sum + nums[i] - nums[i - k];
            max = Math.max(sum, max);
        }
        return (max * 1.0) / k;
    }
}

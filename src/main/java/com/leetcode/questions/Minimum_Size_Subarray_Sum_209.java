package com.leetcode.questions;

public class Minimum_Size_Subarray_Sum_209 {
    public static void main(String[] args) {
        int target = 11;
        int[] nums = {1,1,1,1,1,1,1,1};
        System.out.println("The min subarray is of length "+ minSubArrayLen(target, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        long sum = 0;
        int minLength = n + 1;
        for (int end = 0, start = 0; end < n; ++end) {
            sum = sum + nums[end];

            while (sum >= target) {
                minLength = Math.min(minLength, end - start + 1);
                sum = sum -nums[start];
                start++;
            }
        }
        return minLength <= n ? minLength : 0;
    }
}

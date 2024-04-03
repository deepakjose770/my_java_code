package com.leetcode.questions;

public class Minimum_in_Rotated_Sorted_Array_153 {
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,1,2};
        System.out.println(findMin(nums));
    }

    private static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int middle = (left + right) / 2;
            if (nums[middle] < nums[right]) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return nums[left];
    }
}

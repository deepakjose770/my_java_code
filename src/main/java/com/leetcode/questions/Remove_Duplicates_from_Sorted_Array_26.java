package com.leetcode.questions;

public class Remove_Duplicates_from_Sorted_Array_26 {
    public static int removeDuplicates(int[] nums) {
        //https://leetcode.com/problems/remove-duplicates-from-sorted-array/solutions/3676877/best-method-100-c-java-python-beginner-friendly/
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4};
        int len = removeDuplicates(nums);
        System.out.println("New length: " + len);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}


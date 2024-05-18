package com.leetcode.questions;

public class Remove_Duplicates_From_Sorted_Array_26 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Handle empty array

        int j = 1; // pointer for next unique element position
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j] = nums[i]; // Copy unique element
                j++;
            }
        }
        return j; // This is the number of unique elements (length of the modified array)
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4};
        int uniqueCount = removeDuplicates(nums);
        System.out.println("Unique elements: " + uniqueCount);
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(nums[i] + " "); // Print the modified array (first 'uniqueCount' elements)
        }
    }

}



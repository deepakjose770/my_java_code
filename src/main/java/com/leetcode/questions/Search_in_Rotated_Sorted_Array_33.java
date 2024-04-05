package com.leetcode.questions;

public class Search_in_Rotated_Sorted_Array_33 {
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2,3};
        int k = 0;
        System.out.println("The search location is " +search(nums, k));
    }

    private static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right)/2;
            if (nums[middle] == target) {
                return middle;
            }
            if(nums[left] <= nums[middle]) {
                if (nums[left] < target && target < nums[middle]) {
                    right = middle - 1  ;
                }
                else {
                    left = middle + 1;
                }
            } else {
                if (nums[middle] < target  && target < nums[right]) {
                    left = middle + 1;
                } else {
                    right = middle -1;
                }
            }
        }
        return -1;
    }
}

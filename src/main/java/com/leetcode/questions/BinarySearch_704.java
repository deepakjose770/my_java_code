package com.leetcode.questions;

public class BinarySearch_704 {
    public static void main(String[] args) {
        int[] nums = {5};
        int target = 5;
        System.out.println("The target is available at "+ search(nums, target));
    }

    private static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        while (low<=high) {
            mid  = (low + high)/2;
            if(target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid-1;
            }
        }
        return -1;
    }
}

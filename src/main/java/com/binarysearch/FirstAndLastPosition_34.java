package com.binarysearch;

import java.util.Arrays;

public class FirstAndLastPosition_34 {
    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }

    private static int[] searchRange(int[] nums, int target) {
        int left = findLeftIndex(target, nums);
        int right = findRightIndex(target, nums);
        return new int[]{left, right};
    }

    private static int findRightIndex(int target, int[] nums) {
        int index = -1;
        int high  = nums.length-1;
        int low = 0;
        int mid = -1;
        while (low <= high) {
            mid = (high + low)/2;
            if(nums[mid] == target) {
                index = mid;
                low = mid + 1;
            }
            if (nums[mid] > target) {
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return index;
    }

    private static int findLeftIndex(int target, int[] nums) {
        int index = -1;
        int high  = nums.length-1;
        int low = 0;
        int mid = -1;
        while (low <= high) {
            mid = (high + low)/2;
            if(nums[mid] == target) {
                index = mid;
                high = mid - 1;
            }
            if (nums[mid] > target) {
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return index;
    }
}

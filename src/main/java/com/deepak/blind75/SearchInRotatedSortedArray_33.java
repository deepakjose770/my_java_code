package com.deepak.blind75;

public class SearchInRotatedSortedArray_33 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println("The target is available at location "+ search(nums, target));
    }

    private static int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length-1;
            int mid = 0;

            while (left <= right) {
                mid = left + (right-left)/2;

                if(nums[mid] == target) {
                    return mid;
                }

                if (nums[left] <= nums[mid]) {
                    if(nums[left] <= target && target < nums[mid]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else {
                    if (nums[mid] < target && target<= nums[right]) {
                        left = left + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
        return -1;
    }
}

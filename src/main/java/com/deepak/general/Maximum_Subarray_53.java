package com.deepak.general;

public class Maximum_Subarray_53 {
    public static void main(String[] args) {

    }

    public int maxSubArray(int[] nums) {
        int currentMaxSum = nums[0];
        int maxSum = nums[0];

        for (int i =1; i< nums.length; i++) {
            currentMaxSum  = Math.max(nums[i],currentMaxSum + nums[i]);
            maxSum = Math.max(currentMaxSum, maxSum);
        }
        return maxSum;
    }
}

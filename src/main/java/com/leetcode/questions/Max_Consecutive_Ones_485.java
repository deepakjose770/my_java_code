package com.leetcode.questions;

public class Max_Consecutive_Ones_485 {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount  = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            }
            if (nums[i] == 0) {
                count = 0;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    private static int findMaxConsecutiveOnes2(int[] nums) {
        int max  = 0;
        int count = 0;
        for(int num: nums) {
            if(num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }


    public int findMaxConsecutiveOnes1(int[] nums)
    {
        int maxCount=0;
        int curCount=0;
        for(int element: nums){
            if(element==0){
                if(maxCount<curCount){
                    maxCount=curCount;
                }
                curCount=0;
            }
            else{
                curCount++;
            }
        }
        return maxCount>curCount? maxCount:curCount;
    }
}

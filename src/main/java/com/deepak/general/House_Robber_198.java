package com.deepak.general;

public class House_Robber_198 {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println("The max loot possible is " + rob(nums));
    }

    private static int rob(int[] nums) {
        int arrayLength = nums.length;
        if(arrayLength <2) {
            return nums[0];
        }

        int[] dpArray = new int[arrayLength];

        dpArray[0] = nums[0];
        dpArray[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < arrayLength; i++) {
            dpArray[i] = Math.max(nums[i] + dpArray[i-2], dpArray[i-1]);
        }
        return dpArray[arrayLength-1];
    }
}

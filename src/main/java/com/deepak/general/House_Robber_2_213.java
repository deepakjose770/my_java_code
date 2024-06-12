package com.deepak.general;

public class House_Robber_2_213 {
    public static void main(String[] args) {
        int[] nums = {0,0};
        System.out.println(" The max loot is " + rob(nums));
    }

    private static int rob(int[] nums) {
        int arrayLength = nums.length;
        if(arrayLength <2 ) {
            return nums[0];
        }

        int[] robFirstHouseList = new int[arrayLength -1];
        int[] skipFirstHouseList = new int[arrayLength -1];
        for (int i = 0; i < arrayLength - 1; i++) {
            robFirstHouseList[i] = nums[i];
            skipFirstHouseList[i] = nums[i + 1];
        }

        int robFirstHouseSum = robHelper(robFirstHouseList);
        int skipFirstHouseSum = robHelper(skipFirstHouseList);
        return Math.max(robFirstHouseSum, skipFirstHouseSum);
    }

    private static int robHelper(int[] houses) {
        int arrayLength = houses.length;
        if(arrayLength < 2) {
            return houses[0];
        }
        int[] helperArray = new int[arrayLength];
        helperArray[0] = houses[0];
        helperArray[1] = Math.max(houses[0], houses[1]);
        for (int i = 2; i < arrayLength; i++) {
            helperArray[i]  = Math.max(houses[i] + helperArray[i-2], helperArray[i-1]);
        }
        return helperArray[arrayLength -1];
    }
}

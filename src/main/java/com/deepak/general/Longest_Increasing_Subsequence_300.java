package com.deepak.general;

import java.util.Arrays;

public class Longest_Increasing_Subsequence_300 {
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println("The max is " + new Longest_Increasing_Subsequence_300().lengthOfLIS(nums));

    }
    public int lengthOfLIS(int[] nums) {
        int arrayLength = nums.length;
        int[] trackList = new int[arrayLength];

        for (int i = 1; i < arrayLength; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (trackList[j] + 1 > trackList[i]) {
                        trackList[i] = trackList[j] + 1;
                    }
                }
            }
        }

        return Arrays.stream(trackList).max().getAsInt() + 1;
    }
}

package com.leetcode.questions;

public class Max_Consecutive_Ones_III_1004 {
    public static void main(String[] args) {
        int[] nums ={1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        //System.out.println(longestOnes(nums, k));
    }

    /*private static int longestOnes1(int[] nums, int k) {
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            
            i++;
        }
    }
    private static int longestOnes1(int[] nums, int k) {
        int count = 0;
        int maxCount = 0;
        int tempK = k;
        int j =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                k--;
            }

            if (k<0) {
                if (nums[j] == 0) {
                    k++;
                }
                j++;
            }
        }
        return maxCount;
    }*/
}

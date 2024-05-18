package com.leetcode.questions;

import java.util.Arrays;

public class _27_Remove_Element {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int k =3;
        System.out.println(removeElement(nums, k));
    }
    public static int removeElement(int[] nums, int val) {
        int replacePoint = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[replacePoint] = nums[i];
                replacePoint++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return replacePoint;
    }
}

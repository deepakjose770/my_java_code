package com.deepak.weekOne;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int insertPosition = 0;
        int[] nums = {0,1,0,3,12};
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[insertPosition] = nums[i];
                insertPosition++;
            }
        }

        while (insertPosition < nums.length) {
            nums[insertPosition++]= 0;
        }

        System.out.println(Arrays.toString(nums));
    }
}

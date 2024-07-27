package com.deepak.blind75;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ProductOfArrayExceptSelf_238 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println("The new array is "+ Arrays.toString(productExceptSelf(nums)));
    }

    private static int[] productExceptSelf(int[] nums) {
        int arrayLength = nums.length;
        int[] result = new int[arrayLength];
        int[] leftProduct = new int[arrayLength];
        int[] rightProduct = new int[arrayLength];

        leftProduct[0] = 1;
        rightProduct[arrayLength -1] = 1;

        for (int i = 1; i <= arrayLength-1; i++) {
            leftProduct[i] = leftProduct[i-1] * nums[i-1];
            rightProduct[arrayLength -1 - i] = rightProduct[arrayLength-i]* nums[arrayLength -i];
        }

        for (int i = 0; i <= arrayLength-1; i++) {
            result[i] = leftProduct[i]* rightProduct[i];
        }
        return result;
    }
}

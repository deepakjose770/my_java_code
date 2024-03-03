package com.deepak.weekTwo;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PivotIndex {
    public static void main(String[] args) {
        //int[] nums = {1,7,3,6,5,6};
        int[] nums = {1,2,3};
        System.out.println(pivotIndexLeetcode(nums));
    }

    public static int pivotIndexLeetcode(int[] nums) {
        int totalSum = 0;
        int leftsum = 0;
        for (int ele : nums)
            totalSum += ele;
        for (int i = 0; i < nums.length; leftsum = leftsum+ nums[i++])
            if (leftsum * 2 == totalSum - nums[i])
                return i;
        return -1;
    }

    public static int pivotIndex(int[] nums) {

        int sum = IntStream.of(nums).sum();
        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if(leftSum == (sum-nums[i]-leftSum)) {
                return i;
            } else {
                leftSum= leftSum+nums[i];
            }
        }

        /*int rightPointer = nums.length-1;
        int leftPointer = 0;

        int leftSum =nums[leftPointer];
        int rigthSum=nums[rightPointer];

        while (leftPointer<rightPointer && rightPointer-leftPointer != 2) {
            if(leftSum < rigthSum) {
                leftPointer = leftPointer +1;
                leftSum = leftSum + nums[leftPointer];
            } else {
                rightPointer = rightPointer -1;
                rigthSum = rigthSum + nums[rightPointer];
            }
            if(rigthSum == leftSum){
                return leftPointer+1;
            }
        }*/

        return -1;
    }
}

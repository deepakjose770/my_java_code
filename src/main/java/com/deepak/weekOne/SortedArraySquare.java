package com.deepak.weekOne;

import java.util.Arrays;

public class SortedArraySquare {
    public static void main(String[] args) {
        int nums[] = {-4,-2,-1,0,2,4,6};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    private static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i]*nums[i];
        }

        int head = 0;
        int tail = nums.length-1;

        for(int pos = nums.length - 1; pos>=0; pos--) {

            if(nums[head] > nums[tail]) {
                result[pos] = nums[head];
                head++;
            }
            else {
                result[pos] = nums[tail];
                tail--;
            }
        }
        return result;
    }
}

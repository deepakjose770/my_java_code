package com.deepak.general;

public class MajorityElement_169 {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println("The majority element is "+ majorityElement(nums));
    }

    //Boyer-Moore Voting Algorithm
    public static int majorityElement(int[] nums) {
        int majorityElemnt = 0;
        int count = 0;

        for (int num:nums) {
            if(count == 0) {
                majorityElemnt = num;
            }

            if(num == majorityElemnt) {
                count++;
            } else {
                count --;
            }

        }
        return majorityElemnt;
    }
}

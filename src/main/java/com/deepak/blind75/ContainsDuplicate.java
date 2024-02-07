package com.deepak.blind75;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3,5,6};
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> intSet = new HashSet<>();
        for(int i: nums) {
            if(intSet.contains(i)) {
                return true;
            }
            intSet.add(i);
        }
        return false;
    }
}

package com.deepak.general;

import java.util.*;

public class Contains_Duplicate_217 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();
        for (int num : nums) {
            if (integerSet.contains(num)) {
                return true;
            } else {
                integerSet.add(num);
            }
        }
        return false;
    }
}

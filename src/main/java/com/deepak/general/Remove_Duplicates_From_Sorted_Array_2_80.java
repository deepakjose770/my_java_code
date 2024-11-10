package com.deepak.general;

public class Remove_Duplicates_From_Sorted_Array_2_80 {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;

        for (int num : nums) {
            if (i < 2 || num != nums[i - 2]) {
                nums[i] = num;
                i++;
            }
        }
        return i;
    }
}

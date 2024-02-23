package com.deepak.weekOne;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNumbersDisappearedinanArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        int[] nums1 = {4,3,2,7,8,2,3,1};
        int[] nums2 = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
        System.out.println(findDisappearedNumbers2(nums1));
        System.out.println(findDisappearedNumbers2(nums2));
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if(nums[idx] < 0) {
                continue;
            }
            nums[idx] = nums[idx] * -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0) {
                result.add(i+1);
            }
        }
        return result;
    }

    private static List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int idx = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                idx = nums[i]*-1-1;
            }else{
                idx = nums[i]-1;
            }
            if(nums[idx]>0){
                nums[idx] = -nums[idx];
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                list.add(i+1);
            }
        }
        return list;
    }


    //Time consuming but time complexity and space complexity same O(n) and O(n)
    private static List<Integer> findDisappearedNumbers3(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int val : nums) {
            set.add(val);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }


}

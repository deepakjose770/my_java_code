package com.deepak.weekOne;

import java.util.*;

public class IntersectionOfTwoArraysTwo {
    public static void main(String[] args) {
        int[] numsOne = {1,2,2,1};
        int[] numsTwo = {2,2};
        System.out.println("The answer is "+ Arrays.toString(intersection(numsOne, numsTwo)));
         System.out.println("The answer is "+ Arrays.toString(intersection2(numsOne, numsTwo)));
    }

    private static int[] intersection2(int[] nums1, int[] nums2) {
        int[] all = new int[1001];

        for(int i=0; i<nums1.length; ++i){
            all[nums1[i]]++;
        }

        int count = 0;
        for(int i=0; i<nums2.length; ++i){
            if(all[nums2[i]] > 0){
                all[nums2[i]]--;
                nums1[count++] = nums2[i];
            }
        }

        return Arrays.copyOfRange(nums1, 0, count);
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int num : nums1) {
            freqMap.put(num, freqMap.getOrDefault(num,0) + 1);
        }

        for(int num: nums2) {
            if (freqMap.containsKey(num) && freqMap.get(num) > 0) {
                result.add(num);
                freqMap.put(num, freqMap.get(num) - 1);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}

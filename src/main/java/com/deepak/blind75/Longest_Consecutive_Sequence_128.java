package com.deepak.blind75;

import java.util.HashMap;
import java.util.Map;

public class Longest_Consecutive_Sequence_128 {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 5,3, 2, 6};
        System.out.println(longestConsecutive(nums));
    }

    private static int longestConsecutive(int[] nums) {
        int longestLength = 0;
        Map<Integer, Boolean> exploreMap = new HashMap<>();
        for (int num : nums) {
            exploreMap.put(num, Boolean.FALSE);
        }

        for (int num : nums) {
            int currentLength = 1;
            int nextNum = num + 1;
            while (exploreMap.containsKey(nextNum) && !exploreMap.get(nextNum)) {
                currentLength++;
                exploreMap.put(nextNum,Boolean.TRUE);
                nextNum++;
            }

            int previousNum = num -1;
            while (exploreMap.containsKey(previousNum) && !exploreMap.get(previousNum)) {
                currentLength++;
                exploreMap.put(previousNum,Boolean.TRUE);
                previousNum--;
            }
            longestLength = Math.max(longestLength, currentLength);
        }

    return longestLength;
    }
}

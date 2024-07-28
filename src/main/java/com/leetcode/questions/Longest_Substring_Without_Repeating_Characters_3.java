package com.leetcode.questions;

import java.util.HashMap;
import java.util.Map;

public class Longest_Substring_Without_Repeating_Characters_3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int n = lengthOfLongestSubstring(s);
        System.out.println("The longest substring length is " + n);
    }

    private static int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() ==0) {
            return 0;
        }
        int left = 0;
        int right = 0;
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();

        int inputLength = s.length();

        while (right < inputLength) {
            char currentCharacter = s.charAt(right);

            if(map.containsKey(currentCharacter)) {
                left = Math.max(map.get(currentCharacter)+1, left);
            }

            map.put(currentCharacter, right);
            max = Math.max(max, right-left +1);
            right++;
        }

        return max;
    }
}

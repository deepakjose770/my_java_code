package com.deepak.blind75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstringOne(s));
    }


    public static int lengthOfLongestSubstringOne(String s) {
        int leftPointer = 0 ;
        int rightPointer = 0;
        Set<Character> charSet = new HashSet<>();
        int max = 0;
        while (rightPointer<s.length()) {
            if(charSet.contains(s.charAt(rightPointer))) {
                charSet.remove(s.charAt(leftPointer));
                leftPointer++;
            } else {
                charSet.add(s.charAt(rightPointer));
                rightPointer++;
                max = Math.max(max, charSet.size());
            }
        }
        return max;
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        Map<Character, Integer> charLastSeen = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charLastSeen.containsKey(c)) {
                start = Math.max(start, charLastSeen.get(c) + 1); // Update start index
            }
            charLastSeen.put(c, i); // Update last seen index
            maxLength = Math.max(maxLength, i - start + 1); // Update max length
        }
        return maxLength;
    }
}

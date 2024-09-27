package com.deepak.general;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Word_Break_139 {
    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordList = new ArrayList<>();
        wordList.add("leet");
        wordList.add("code");

        System.out.println(new Word_Break_139().wordBreak(s, wordList));


    }
    public boolean wordBreak(String s, List<String> wordDict) {
        int stringLength = s.length();
        boolean[] trackingArray = new boolean[stringLength + 1];
        trackingArray[0] = true;
        Set<String> wordSet = new HashSet<>(wordDict);

        for (int i  = 1; i <= stringLength; i++) {
            for (int j = 0; j < i-1; j++) {
                if (trackingArray[j] && wordSet.contains(s.substring(j,i))) {
                    trackingArray[i] = true;
                    break;
                }
            }
        }
        return trackingArray[stringLength];
    }

    public boolean wordBreakTwo(String s, List<String> wordDict) {
        // Convert the list of words into a hash set for efficient look-up
        Set<String> wordSet = new HashSet<>(wordDict);

        // Get the length of the string 's'
        int strLength = s.length();

        // Initialize a boolean array to keep track of possible word breaks
        // f[i] is true if first i characters of the string can be segmented into dictionary words
        boolean[] wordBreakTracker = new boolean[strLength + 1];

        // Empty string is a valid decomposition
        wordBreakTracker[0] = true;

        // Check each substring starting from length 1 to strLength
        for (int i = 1; i <= strLength; ++i) {

            // Try different break points
            for (int j = 0; j < i; ++j) {

                // If the string up to j can be broken into valid words, and the substring from j to i is in the dictionary
                // Then, mark the position i as true in wordBreakTracker
                if (wordBreakTracker[j] && wordSet.contains(s.substring(j, i))) {
                    wordBreakTracker[i] = true;

                    // Break out of the loop since we have found a valid break point
                    break;
                }
            }
        }

        // The last entry in wordBreakTracker tells if the entire string can be segmented or not
        return wordBreakTracker[strLength];
    }
}
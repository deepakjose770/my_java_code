package com.deepak.general;

import java.util.Arrays;

public class Longest_Palindromic_Substring_5 {

    public static void main(String[] args) {
        // Test case 1
        String s1 = "babad";
        System.out.println("Test 1: " + new Longest_Palindromic_Substring_5().longestPalindromeOne(s1)); // Output can be "bab" or "aba"

        // Test case 2
        String s2 = "cbbd";
        System.out.println("Test 2: " + new Longest_Palindromic_Substring_5().longestPalindrome(s2)); // Output: "bb"
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length()<1) {
            return "";
        }

        int stringLength = s.length();

        String longestSubstring = "";

        for (int i = 0; i<stringLength; i++) {
            String oddString  = expandAroundCenter(s, i, i);
            String evenString = expandAroundCenter(s, i, i+1);
            if (oddString.length() > longestSubstring.length()) {
                longestSubstring = oddString;
            }
            if (evenString.length() > longestSubstring.length()) {
                longestSubstring = evenString;
            }
        }


        return longestSubstring;
    }

    private String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            right++;
            left--;
        }
        return s.substring(left+1, right);
    }


    public String longestPalindromeOne(String s) {
        int n = s.length(); // Get the length of the string.
        boolean[][] dp = new boolean[n][n]; // Create a dynamic programming (DP) table.

        // Initialize all substrings of length 1 (single character) as a palindrome.
        for (boolean[] row : dp) {
            Arrays.fill(row, true);
        }

        int startIdx = 0; // Starting index of the longest palindromic substring found.
        int maxLength = 1; // Length of the longest palindromic substring found, initialized with length 1.

        // Build the DP table in a bottom-up manner.
        for (int i = n - 2; i >= 0; --i) { // Start from the second last character and move backwards.
            for (int j = i + 1; j < n; ++j) { // Compare it with characters ahead of it.
                dp[i][j] = false; // Initialize the current substring (i, j) as not palindrome.
                if (s.charAt(i) == s.charAt(j)) { // If the characters match,
                    dp[i][j] = dp[i + 1][j - 1]; // Check if removing them gives a palindrome.
                    // Update the start position and max length if a larger palindrome is found.
                    if (dp[i][j] && maxLength < j - i + 1) {
                        maxLength = j - i + 1;
                        startIdx = i;
                    }
                }
            }
        }

        // Extract the longest palindromic substring from the string.
        return s.substring(startIdx, startIdx + maxLength);
    }

    public String longestPalindromeTwo(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for (boolean[] row : dp) {
            Arrays.fill(row, true);
        }

        int startIdx = 0;
        int maxLength = 1;
        for (int i = n - 2; i >= 0; --i) {
            for (int j = i + 1; j < n; ++j) {
                dp[i][j] = false;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                    if (dp[i][j] && maxLength < j - i + 1) {
                        maxLength = j - i + 1;
                        startIdx = i;
                    }
                }
            }
        }
        return s.substring(startIdx, startIdx + maxLength);
    }
}

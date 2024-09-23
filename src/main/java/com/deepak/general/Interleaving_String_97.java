package com.deepak.general;

public class Interleaving_String_97 {

    //2d array approach
    //https://chatgpt.com/share/66eeb2a7-0df8-800f-b96b-8de4243c6bce
    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length(), n = s2.length();
        if (m + n != s3.length()) return false;

        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        // Fill first row
        for (int i = 1; i <= m; i++) {
            dp[i][0] = dp[i - 1][0] && s1.charAt(i - 1) == s3.charAt(i - 1);
        }

        // Fill first column
        for (int j = 1; j <= n; j++) {
            dp[0][j] = dp[0][j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);
        }

        // Fill the rest of dp table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) ||
                        (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
            }
        }

        return dp[m][n];
    }


    //One dimentional array approach
    public boolean isInterleave1(String s1, String s2, String s3) {

        // Get the lengths of the strings
        int m = s1.length(), n = s2.length();

        // If the combined length of s1 and s2 does not equal the length of s3, return false
        if (m + n != s3.length()) {
            return false;
        }

        // Create a boolean array to keep track of the interleavings
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        // Iterate over each character of both s1 and s2
        for (int i = 0; i <= m; ++i) {
            for (int j = 0; j <= n; ++j) {

                // Index k for matching characters in s3
                int k = i + j - 1;

                // If there are remaining characters in s1, check if they match s3's characters
                if (i > 0) {
                    dp[j] &= s1.charAt(i - 1) == s3.charAt(k);
                }

                // If there are remaining characters in s2, check if they match s3's characters
                if (j > 0) {
                    dp[j] |= (dp[j - 1] & (s2.charAt(j - 1) == s3.charAt(k)));
                }
            }
        }

        // Return whether it's possible to interleave s1 and s2 to get s3
        return dp[n];
    }
}

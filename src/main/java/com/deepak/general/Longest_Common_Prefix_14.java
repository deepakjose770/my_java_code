package com.deepak.general;

public class Longest_Common_Prefix_14 {
    public static void main(String[] args) {

    }

    public String longestCommonPrefix(String[] strs) {
        int numberOfStrings = strs.length;
        int firstStringLength = strs[0].length();

        for (int i =0; i<firstStringLength; i++) {
            for (int j = 1; j<numberOfStrings; j++) {
                if (strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}

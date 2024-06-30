package com.deepak.general;

public class Valid_Anagram_242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagarai";
        System.out.println(" The given strings are anagram is " + isAnagram(s, t));
    }

    private static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] alphabetArray = new int[26];
        for(int i =0; i < s.length(); i++) {
            alphabetArray[s.charAt(i) - 'a']++;
            alphabetArray[t.charAt(i) - 'a']--;
        }
        for (int num : alphabetArray) {
            if(num != 0) {
                return false;
            }
        }
        return true;
    }
}

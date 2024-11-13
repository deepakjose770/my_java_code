package com.deepak.general;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic_Strings_205 {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(" The strings are isomorphic :- " + isIsomorphic(s,t));
    }

    private static boolean isIsomorphic1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int arrayLength = s.length();

        Map<Character, Character> characterMapS = new HashMap<Character, Character>();
        Map<Character, Character> characterMapT = new HashMap<Character, Character>();

        for (int i = 0; i < arrayLength; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (characterMapS.containsKey(sChar)) {
                if (characterMapS.get(sChar) != tChar) {
                    return false;
                }
            } else {
                characterMapS.put(sChar, tChar);
            }

            if (characterMapT.containsKey(tChar)) {
                if (characterMapT.get(tChar) != sChar) {
                    return false;
                }
            } else {
                characterMapT.put(tChar, sChar);
            }
        }
        return true;
    }

    public static boolean isIsomorphic(String s, String t) {

        // Create two arrays to store the last seen positions of characters
        int[] lastSeenPositionInS = new int[256]; // Assuming extended ASCII
        int[] lastSeenPositionInT = new int[256]; // Assuming extended ASCII

        // Length of the input strings
        int length = s.length();

        // Iterate through each character in the strings
        for (int i = 0; i < length; ++i) {
            // Get the current characters from each string
            char charFromS = s.charAt(i);
            char charFromT = t.charAt(i);

            // If the last seen position of the respective characters
            // in the two strings are not the same, then they are not isomorphic
            if (lastSeenPositionInS[charFromS] != lastSeenPositionInT[charFromT]) {
                return false; // Not isomorphic
            }

            // Update the last seen position of the characters
            // i + 1 is used because default value in int arrays is 0,
            // and we are using the index as a check (can't use 0 as it is the default)
            lastSeenPositionInS[charFromS] = i;
            lastSeenPositionInT[charFromT] = i;
        }

        // If all characters in 's' can be replaced to get 't', return true, as the strings are isomorphic
        return true;
    }
}

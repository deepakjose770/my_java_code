package com.deepak.general;

public class Reverse_Words_In_A_String_151 {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(" The result "+ new Reverse_Words_In_A_String_151().reverseWords(s));
    }

    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder stringBuilder = new StringBuilder();

        int i = s.length() - 1;
        while (i>=0) {
            while (i>=0 && s.charAt(i) == ' ') {
                i--;
            }
            int j = i;
            while (i>=0 && s.charAt(i) != ' ') {
                i--;
            }
            if (j >= 0) {
                stringBuilder.append(s.substring(i+1, j+1));
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString().trim();
    }

    public static String reverseWords1(String s) {
        // Step 1: Trim spaces
        s = s.trim();

        // Step 2: Initialize result and temporary word storage
        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            // Step 3: Skip spaces between words
            while (i >= 0 && s.charAt(i) == ' ') i--;

            // Step 4: Find the start of the current word
            int j = i;
            while (i >= 0 && s.charAt(i) != ' ') i--;

            // Step 5: Extract and add the word to the result
            if (j >= 0) {
                result.append(s.substring(i + 1, j + 1));
                result.append(" ");
            }
        }

        // Step 6: Remove the last added space and return result
        return result.toString().trim();
    }

}

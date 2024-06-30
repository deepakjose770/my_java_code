package com.deepak.notLeetcode;

import java.util.HashMap;
import java.util.Map;

public class Invert_String_by_Nby2 {
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println("The inverted string is " + reverseString(s));
    }

    private static String reverseString(String s) {
        char[] charArray = s.toCharArray();
        char temp;
        int stringLength = s.length();
        for (int i = 0; i < stringLength/2; i++) {
            temp = charArray[i];
            charArray[i] = charArray[stringLength-i-1];
            charArray[stringLength-i-1] = temp;
        }
        return new String(charArray);
    }
}

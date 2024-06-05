package com.deepak.general;

public class NeedleAndHaystack_28 {
    public static void main(String[] args) {
        String needle = "sad";
        String haystak = "asadbutsad";
        System.out.println("The index is "+ strStr(haystak, needle));

    }

    public static int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        for (int i = 0; i < haystackLength+1 -needleLength; i++) {
            if(haystack.substring(i, i+needleLength).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}

package com.leetcode.questions;

public class Palindrome_Number_3 {
    public static void main(String[] args) {
        int n = 1211;
        System.out.println("It is a palindrome :" + isPalindrome(n));
    }

    private static boolean isPalindrome(int x) {
        if (x>0) {
            int original = x;
            int reversedDigit =0;
            while (x>0) {
                int lastDigit = x%10;
                reversedDigit = reversedDigit*10 + lastDigit;
                x = x/10;
            }
            if (original == reversedDigit) {
                return true;
            }
        }
        return false;
    }
}

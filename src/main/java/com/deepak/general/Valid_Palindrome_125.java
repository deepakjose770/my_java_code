package com.deepak.general;

public class Valid_Palindrome_125 {
    public static void main(String[] args) {
        String word = "a man, a plan, a canal: Panama";
        System.out.println(" The word provided is "+ isPalindrome(word));
    }

    private static boolean isPalindrome(String s) {
        if(s == null) {
            return false;
        }
        s= s.toLowerCase();
        int leftPointer = 0;
        int rightPointer = s.length()-1;
        while (leftPointer < rightPointer) {
            if(!Character.isLetterOrDigit(s.charAt(leftPointer))) {
                leftPointer++;
                continue;
            } else if (!Character.isLetterOrDigit(s.charAt(rightPointer))) {
                rightPointer--;
                continue;
            } else if (s.charAt(leftPointer) != s.charAt(rightPointer)) {
                return false;
            }
            rightPointer--;
            leftPointer++;
        }
        return true;
    }
}

package com.deepak.general;

public class Length_of_Last_Word_58 {
    public static void main(String[] args) {
        String s = "Hello World";
        //System.out.println("The last word length is "+ lengthOfLastWord(s));
        System.out.println("The last word length is "+ lengthOfLastWordwithOutSplit(s));
    }

    private static int lengthOfLastWord(String s) {
        s=s.trim();
        String[] wordList = s.split(" ");
        return wordList[wordList.length-1].length();
    }

    private static int lengthOfLastWordwithOutSplit(String s) {
        int count = 0;
        int identifier = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && identifier ==1) {
                return count;
            }
            if(Character.isLetter(s.charAt(i))) {
                count++;
                identifier = 1;
            }
        }
        return count;
    }
}

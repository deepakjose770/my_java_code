package com.leetcode.questions;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses_22 {

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private static void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        // Test case 1
        int n1 = 3;
        System.out.println("Test case 1 (n=3): " + generateParenthesis(n1));

        // Test case 2
        //int n2 = 2;
        //System.out.println("Test case 2 (n=2): " + generateParenthesis(n2));
    }
}


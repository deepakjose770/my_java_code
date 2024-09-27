package com.deepak.general;

import java.util.ArrayDeque;
import java.util.Deque;

public class Valid_Parentheses_20 {

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '{' || c=='[' || c=='(') {
                stack.push(c);
            } else if (stack.isEmpty() || !match(stack.pop(),c)){
                return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean match(Character left, char right) {
        return  ((left=='(' && right == ')') || (left=='{' && right == '}') || (left=='[' && right == ']'));
    }
}

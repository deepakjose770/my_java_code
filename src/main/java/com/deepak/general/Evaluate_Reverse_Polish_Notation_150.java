package com.deepak.general;

import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation_150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") ||
                    token.equals("-") ||
                    token.equals("*") ||
                    token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(a+b);
                        break;
                    case "-":
                        stack.push(a-b);
                        break;
                    case "*":
                        stack.push(a*b);
                        break;
                    case "/":
                        stack.push(a/b);
                        break;
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
}

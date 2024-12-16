package com.deepak.general;

import java.util.Stack;

public class Simplify_Path_71 {
    public String simplifyPath(String path) {
        String[] splitDirectories = path.split("/");
        Stack<String> stack  = new Stack<>();

        for (String str : splitDirectories) {
            if (str.isEmpty() || str.equals(".")) {
                continue;
            }
            if (str.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(str);
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, "/"+ stack.pop());
        }
        return result.length()>0 ? result.toString() : "/";
    }

    public static void main(String[] args) {
        System.out.println(new Simplify_Path_71().simplifyPath("/home/")); // Output: "/home"
        System.out.println(new Simplify_Path_71().simplifyPath("/home/user/Documents/../Pictures")); // Output: "/c"
    }
}

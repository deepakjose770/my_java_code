package com.deepak.general;

import com.deepak.util.TreeNode;

public class Same_Tree_100 {
    public static void main(String[] args) {

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        String s= "abcd";
        int a = s.length();

        if (p == null || q == null || p.val!= q.val) {
            return false;
        }

        return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }
}
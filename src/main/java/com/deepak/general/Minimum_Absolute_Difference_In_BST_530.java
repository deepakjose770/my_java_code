package com.deepak.general;

import com.deepak.util.TreeNode;

public class Minimum_Absolute_Difference_In_BST_530 {
    public static void main(String[] args) {

    }

    private int minDifference;
    private int previousValue;
    private static final int INFINITY = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        minDifference = INFINITY;
        previousValue = INFINITY;
        inOrderTraversal(root);
        return minDifference;
    }

    private void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        if (INFINITY != previousValue) {
            minDifference = Math.min(minDifference, (root.val - previousValue));
        }
        previousValue = root.val;
        inOrderTraversal(root.right);
    }
}

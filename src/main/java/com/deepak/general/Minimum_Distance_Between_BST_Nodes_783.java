package com.deepak.general;

import com.deepak.util.TreeNode;

public class Minimum_Distance_Between_BST_Nodes_783 {

    private int minDifference;
    private int previous;
    private final int MAX_INT = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        minDifference = MAX_INT;
        previous = MAX_INT;
        depthFirstSearch(root);
        return minDifference;
    }

    private void depthFirstSearch(TreeNode root) {
        if (root == null) {
            return;
        }
        depthFirstSearch(root.left);
        minDifference = Math.min(minDifference, Math.abs(root.val - previous));
        previous = root.val;
        depthFirstSearch(root.right);
    }
}

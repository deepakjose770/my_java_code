package com.deepak.general;

import com.deepak.util.TreeNode;

public class Diameter_Of_Binary_Tree_543 {
    int maxDiameter;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        depthFirstSearch(root);
        return maxDiameter;
    }
    private int depthFirstSearch(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftMaxDia = depthFirstSearch(root.left);
        int rightMaxDia = depthFirstSearch(root.right);

        maxDiameter = Math.max(maxDiameter, leftMaxDia + rightMaxDia);

        return 1 + Math.max(rightMaxDia, leftMaxDia);
    }
}

package com.deepak.general;

import com.deepak.util.TreeNode;

public class Path_Sum_112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSumDFS(root, targetSum);
    }

    private boolean hasPathSumDFS(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        targetSum = targetSum - root.val;

        if(root.left == null && root.right == null && targetSum ==0) {
            return true;
        }

        return hasPathSumDFS(root.left, targetSum) || hasPathSumDFS(root.right, targetSum);
    }
}

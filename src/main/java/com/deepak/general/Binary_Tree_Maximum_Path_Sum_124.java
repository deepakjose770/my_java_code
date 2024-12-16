package com.deepak.general;

public class Binary_Tree_Maximum_Path_Sum_124 {
    private int maxSum;
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        maxGain(root);
        return maxSum;
    }

    private int maxGain(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftGain = Math.max(maxGain(root.left), 0);
        int rightGain = Math.max(maxGain(root.right), 0);

        int localSum = root.val + leftGain + rightGain;

        maxSum = Math.max(localSum, maxSum);
        return root.val + Math.max(leftGain, rightGain);
    }
}

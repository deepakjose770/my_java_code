package com.deepak.general;

import com.deepak.util.TreeNode;

public class Binary_Tree_Tilt_563 {
    public static void main(String[] args) {

    }
    int totalTilt;

    public int findTilt(TreeNode root) {
        totalTilt = 0;
        findSum(root);
        return totalTilt;
    }

    private int findSum(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftSum = findSum(root.left);
        int rightSum = findSum(root.right);

        totalTilt = totalTilt + Math.abs(leftSum - rightSum);

        return leftSum + rightSum + root.val;
    }
}

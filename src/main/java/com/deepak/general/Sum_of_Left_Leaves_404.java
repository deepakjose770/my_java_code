package com.deepak.general;

import com.deepak.util.TreeNode;

public class Sum_of_Left_Leaves_404 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println("The sum of left leaves = "+ sumOfLeftLeaves(root));

    }

    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int sum =0;

        if(root.left!= null && isLeaf(root.left)) {
            sum = sum + root.left.val;
        }

        sum = sum + sumOfLeftLeaves(root.left);
        sum = sum + sumOfLeftLeaves(root.right);

        return sum;
    }

    private static boolean isLeaf(TreeNode left) {
        return left.left == null && left.right == null;
    }
}

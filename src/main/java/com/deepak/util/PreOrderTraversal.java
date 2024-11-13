package com.deepak.util;

import java.util.Stack;

public class PreOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(40);

        root.left = new TreeNode(30);
        root.left.left = new TreeNode(25);
        root.left.right = new TreeNode(35);
        /////////////////////////////////////////////
        root.right = new TreeNode(50);
        root.right.left = new TreeNode(45);
        root.right.right = new TreeNode(60);

        System.out.println("The preorder traversal is ");
        preOrderTraversal(root);
    }

    private static void preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.val + "->");

            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }
}

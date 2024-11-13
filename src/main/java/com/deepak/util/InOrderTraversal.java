package com.deepak.util;

import java.util.Stack;

public class InOrderTraversal {

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
        inOrderTraversal(root);
    }

    private static void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode current = root;
        Stack<TreeNode> stack  = new Stack<>();

        while (!stack.isEmpty() || current != null) {
            while (current != null) {
                stack.push(current);
                current=current.left;
            }
            current = stack.pop();
            System.out.print(current.val + "->");
            current = current.right;
        }
    }
}

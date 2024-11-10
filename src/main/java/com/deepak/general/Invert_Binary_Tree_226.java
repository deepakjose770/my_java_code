package com.deepak.general;

import com.deepak.util.TreeNode;

import java.util.Stack;

public class Invert_Binary_Tree_226 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode currentNode = stack.pop();

            TreeNode temp = currentNode.right;
            currentNode.right = currentNode.left;
            currentNode.left = temp;

            if (currentNode.left != null ) {
                stack.push(currentNode.left);
            }
            if (currentNode.right != null) {
                stack.push(currentNode.right);
            }
        }
        return root;
    }
}

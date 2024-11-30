package com.deepak.general;

import com.deepak.util.TreeNode;

import java.util.Stack;

public class Sum_Root_To_Leaf_Numbers_129 {
    public int sumNumbers(TreeNode root) {
        return depthFirstSearch(0, root);
    }

    private int depthFirstSearch(int currentSum, TreeNode root) {
        if (root == null) {
            return 0;
        }
        currentSum = currentSum*10 + root.val;
        if (root.left == null && root.right == null) {
            return currentSum;
        }
        return depthFirstSearch(currentSum, root.left) + depthFirstSearch(currentSum, root.right);
    }


    // Helper class to store node and its accumulated sum
    private static class Pair {
        TreeNode node;
        int sum;

        Pair(TreeNode node, int sum) {
            this.node = node;
            this.sum = sum;
        }
    }

    // Iterative DFS using a stack
    public int sumNumbersWithStack(TreeNode root) {
        if (root == null) return 0;

        int totalSum = 0;

        // Stack to store nodes and their current accumulated sum
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, 0));

        while (!stack.isEmpty()) {
            Pair current = stack.pop();
            TreeNode node = current.node;
            int currentSum = current.sum * 10 + node.val;

            // If it's a leaf node, add the current sum to the total
            if (node.left == null && node.right == null) {
                totalSum += currentSum;
            }

            // Push right and left children onto the stack
            if (node.right != null) {
                stack.push(new Pair(node.right, currentSum));
            }
            if (node.left != null) {
                stack.push(new Pair(node.left, currentSum));
            }
        }

        return totalSum;
    }
}

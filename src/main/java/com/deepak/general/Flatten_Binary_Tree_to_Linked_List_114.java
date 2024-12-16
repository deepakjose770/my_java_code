package com.deepak.general;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Flatten_Binary_Tree_to_Linked_List_114 {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        flatten(root.left);
        flatten(root.right);

        TreeNode tempRight  = root.right;

        root.right = root.left;
        root.left = null;

        TreeNode currentNode = root;
        while (currentNode.right != null) {
            currentNode = currentNode.right;
        }

        currentNode.right = tempRight;
    }
}

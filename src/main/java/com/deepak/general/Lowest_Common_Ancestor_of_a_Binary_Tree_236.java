package com.deepak.general;



public class Lowest_Common_Ancestor_of_a_Binary_Tree_236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null || p == root || q == root) {
            return root;
        }

        TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
        TreeNode righNode = lowestCommonAncestor(root.right, p, q);

        if (leftNode == null) {
            return righNode;
        }

        if (righNode == null) {
            return leftNode;
        }
        return root;
    }
}

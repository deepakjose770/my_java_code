package com.deepak.general;

import com.deepak.util.TreeNode;

public class SubTree_Of_Another_Tree_572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if ((root == null && subRoot == null) ||
                (root != null && subRoot == null)) {
            return true;
        }

        if(root == null && subRoot != null) {
            return false;
        }

        if(isIdentical(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isIdentical(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }

        if (root != null && subRoot != null) {
            return root.val == subRoot.val &&
                    isIdentical(root.right, subRoot.right) &&
                    isIdentical(root.left, subRoot.left);
        }
        return false;
    }
}

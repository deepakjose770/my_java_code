package com.deepak.blind75;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Validate_Binary_Search_Tree_98 {
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode node, long low, long high) {
        if (node == null) {
            return true;
        }
        if (node.val <= low || node.val >= high) {
            return false;
        }
        return validate(node.left, low, node.val) && validate(node.right, node.val, high);
    }


    public boolean isValidBST2(TreeNode root) {
        List<Integer> inOrderList = new ArrayList<>();
        helper(root,inOrderList);
        boolean isBST = true;
        int prev = inOrderList.get(0);
        for (int i = 1; i < inOrderList.size(); i++) {
            if (inOrderList.get(i) <= prev) {
                isBST =false;
            }
            prev = inOrderList.get(i);
        }
        return isBST;
    }

    private void helper(TreeNode root, List<Integer> inOrderList) {
        if (root == null) {
            return;
        }
        helper(root.left, inOrderList);
        inOrderList.add(root.val);
        helper(root.right, inOrderList);
    }


    public static void main(String[] args) {
        Validate_Binary_Search_Tree_98 s = new Validate_Binary_Search_Tree_98();

        // Test case 1: Valid BST
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(3);

        System.out.println(s.isValidBST(root1)); // Output: true
        System.out.println(s.isValidBST2(root1));

        // Test case 2: Invalid BST
        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(4);
        root2.right.left = new TreeNode(3);
        root2.right.right = new TreeNode(6);

        System.out.println(s.isValidBST(root2)); // Output: false
        System.out.println(s.isValidBST2(root2));
    }
}

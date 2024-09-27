package com.deepak.general;

import com.deepak.util.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Kth_Smallest_Element_In_A_BST_230 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        System.out.println(new Kth_Smallest_Element_In_A_BST_230().kthSmallest(root, 3));
    }

    public int kthSmallest(TreeNode root, int k) {

        Deque<TreeNode> stack = new ArrayDeque<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();

            if (--k == 0) {
                return root.val;
            }
            root = root.right;
        }
        return 0;
    }
}

package com.deepak.blind75;

import com.deepak.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Max_Depth_of_Binary_Tree_104 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left= new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(new Max_Depth_of_Binary_Tree_104().maxDepth(root));
    }


    int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        Queue<TreeNode> nodes = new LinkedList<>();

        nodes.add(root);
        int levels = 0;

        while (!nodes.isEmpty()) {
            levels++;
            int size = nodes.size();
            for (int i = 0; i < size; i++) {
                TreeNode poppedNode = nodes.poll();
                if (poppedNode.left != null) nodes.add(poppedNode.left);
                if (poppedNode.right != null) nodes.add(poppedNode.right);
            }
        }
        return levels;
    }
}

package com.deepak.general;

import com.deepak.util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Binary_Tree_Level_Order_Traversal_102 {
    public static void main(String[] args) {

    }


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelOrderTraversalList = new ArrayList<>();
        if (root == null) {
            return levelOrderTraversalList;
        }
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int currentQueueSize = queue.size();
            List<Integer> levelList = new ArrayList<>();
            for (int i = currentQueueSize; i>0; i--) {
                TreeNode currentNode = queue.poll();
                levelList.add(currentNode.val);

                if (currentNode.left != null) {
                    queue.addLast(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.addLast(currentNode.right);
                }
            }
            levelOrderTraversalList.add(levelList);
        }
        return levelOrderTraversalList;
    }
}

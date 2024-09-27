package com.deepak.general;

import com.deepak.util.TreeNode;
import com.sun.source.tree.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class Binary_Tree_ZIG_Zag_BFS_103 {
    public static void main(String[] args) {

    }


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result  = new ArrayList<>();
        if (root == null) {
            return result;
        }

        boolean inverter = false;

        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int queueSize  = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 0; i<queueSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            if (inverter) {
                Collections.reverse(currentLevel);
            }
            result.add(currentLevel);
            inverter = !inverter;
        }
        return result;
    }

    public List<List<Integer>> zigzagLevelOrder1(TreeNode root) {
        // List to hold the result
        List<List<Integer>> result = new ArrayList<>();
        // Return an empty list if the tree is empty
        if (root == null) {
            return result;
        }

        // Queue to store the nodes for level order traversal
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        // Flag for zigzag traversal direction
        boolean leftToRight = true;

        // Perform level order traversal while queue is not empty
        while (!queue.isEmpty()) {
            // Temporary list to hold current level's values
            List<Integer> tempList = new ArrayList<>();
            // Process all nodes at the current level
            for (int i = queue.size(); i > 0; --i) {
                // Poll a node from the queue
                TreeNode currentNode = queue.poll();
                // Add the node's value to the temporary list
                tempList.add(currentNode.val);
                // Add the left child to the queue if it exists
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                // Add the right child to the queue if it exists
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }

            // If the current direction is right to left, reverse the list
            if (!leftToRight) {
                Collections.reverse(tempList);
            }
            // Add the level's values to the result list
            result.add(tempList);
            // Toggle the zigzag direction
            leftToRight = !leftToRight;
        }

        // Return the final zigzag level order list
        return result;
    }


    public List<List<Integer>> zigzagLevelOrder2(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        boolean leftToRight = true;
        while (!queue.isEmpty()) {
            List<Integer> tempList = new ArrayList<>();
            for (int i = queue.size(); i > 0; --i) {
                TreeNode currentNode = queue.poll();
                tempList.add(currentNode.val);
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            if (!leftToRight) {
                Collections.reverse(tempList);
            }
            result.add(tempList);
            leftToRight = !leftToRight;
        }
        return result;
    }
}

package com.deepak.general;

import com.deepak.util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Average_Of_Levels_In_Binary_Tree_637 {
    public static void main(String[] args) {

    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> averages = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        if (root == null) {
            return averages;
        }

        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            long sum = 0;

            for (int i = levelSize; i > 0; i--) {
                TreeNode currentnode = queue.pollFirst();
                sum = sum + currentnode.val;

                if (currentnode.left != null) {
                    queue.offer(currentnode.left);
                }
                if (currentnode.right != null) {
                    queue.offer(currentnode.right);
                }
            }
            averages.add((double)sum/levelSize);
        }
        return averages;
    }
}

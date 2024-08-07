package com.deepak.general;

import com.deepak.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Find_Mode_In_BST_501 {
    public static void main(String[] args) {

    }

    TreeNode previousNode;
    int maxFrequency;
    int currentCount;
    List<Integer> modes;

    public int[] findMode(TreeNode root) {
        modes = new ArrayList<>();
        inOrderTraversal(root);
        int[] result = new int[modes.size()];
        for (int i = 0; i < modes.size(); ++i) {
            result[i] = modes.get(i);
        }
        return result;
    }

    private void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left);

        currentCount = (previousNode != null && root.val == previousNode.val) ? currentCount+1 : 1;

        if(currentCount > maxFrequency) {
            maxFrequency = currentCount;
            modes = new ArrayList<>();
            modes.add(root.val);
        } else if (currentCount == maxFrequency) {
            modes.add(root.val);
        }
         previousNode = root;

        inOrderTraversal(root.right);
    }
}

package com.deepak.general;

import com.deepak.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Paths_257 {
    List<String> currentPath = new ArrayList<>();
    List<String> resultPaths = new ArrayList<>();
    
    public List<String> binaryTreePaths(TreeNode root) {
        depthFirstSearch(root);
        return resultPaths; 

    }

    private void depthFirstSearch(TreeNode root) {
        if (root == null) {
            return;
        }

        currentPath.add(String.valueOf(root.val));

        if(root.left == null && root.right == null) {
            resultPaths.add(String.join("->", currentPath));
        } else {
            depthFirstSearch(root.left);
            depthFirstSearch(root.right);
        }
        currentPath.remove(currentPath.size() - 1);
    }
}

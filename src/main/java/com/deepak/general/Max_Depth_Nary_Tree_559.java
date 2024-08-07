package com.deepak.general;

public class Max_Depth_Nary_Tree_559 {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int maxDepth  = 0;

        for(Node child : root.children) {
            maxDepth = Math.max(maxDepth, maxDepth(child));
        }
        return maxDepth + 1;
    }
}

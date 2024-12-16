package com.deepak.general;

public class Count_Complete_Tree_Nodes_222 {
    public int countNodes(TreeNode root) {
        //int currentNode = root.val;
        if (root == null) {
            return 0;
        }
        int rightHeight = getHeight(root, true);
        int leftHeight = getHeight(root, false);

        if (rightHeight == leftHeight) {
            int newHeight = (1 << leftHeight) - 1;
            return newHeight;
        } else {

            int leftCount = countNodes(root.left);
            int rightCount = countNodes(root.right);
            return 1 + leftCount + rightCount;
        }
    }

    private int getHeight(TreeNode root, boolean isRight) {
        int height = 0;
        while (root != null) {
            height++;
            root = isRight ? root.right : root.left;
        }
        return height;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);
        root1.right.left = new TreeNode(6);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);
        root2.right.left = new TreeNode(6);
        root2.right.right = new TreeNode(7);

        Count_Complete_Tree_Nodes_222 solution = new Count_Complete_Tree_Nodes_222();
        System.out.println(solution.countNodes(root1)); // Output: 6
        //System.out.println(solution.countNodes(root2)); // Output: 7
    }
}

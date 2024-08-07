package com.deepak.general;

import java.util.LinkedList;
import java.util.Queue;

class BNode {
    int data;
    BNode right;
    BNode left;

    public BNode(int data) {
        this.data = data;
    }
}

public class BinaryTree {
    BNode root;

    public void insert(int data) {
        root = insetRec(root, data);
    }

    private BNode insetRec(BNode root, int data) {
        if (root == null) {
            root = new BNode(data);
        } else if (data < root.data) {
            root.left = insetRec(root.left, data);
        } else if (data > root.data) {
            root.right = insetRec(root.right, data);
        }
        return root;
    }

    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(BNode root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }

    public void preOrder() {
        preOrderRec(root);
    }

    private void preOrderRec(BNode root) {
        if(root != null) {
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    public void postOrder() {
        postOrderRec(root);
    }

    private void postOrderRec(BNode root) {
        if(root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    public void printLevelOrder() {
        Queue<BNode> queue = new LinkedList<BNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BNode tempNode =  queue.poll();
            System.out.print(tempNode.data + " ");

            if(tempNode.left != null) {
                queue.add(tempNode.left);
            }

            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }


    public BNode searchBST(BNode root, int val) {
        while (root != null && root.data != val) {
            root = (root.data < val) ? root.right : root.left;
        }
        return root;
    }
}

package com.deepak.general;

public class MyBinaryTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);
        tree.insert(18);
        tree.insert(1);
        tree.insert(4);
        tree.insert(3);

        System.out.println("Inorder");
        tree.inOrder();
        System.out.println();
        System.out.println("Preorder");
        tree.preOrder();
        System.out.println();
        System.out.println("Postorder");
        tree.postOrder();
        System.out.println();
        System.out.println("LevelOrder");
        tree.printLevelOrder();

        System.out.println();
        System.out.println();
        System.out.println(" The value 5 is present in the tree: " + tree.searchBST(tree.root, 5).data);




    }
}

package com.deepak.general;

import com.deepak.util.ListNode;
import com.util.MyLinkedList;

public class Merge_Two_Sorted_LinkedList_21 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,4};
        int[] arr2 = {1,3,4};

        MyLinkedList<Integer> newLinkedList1 = new MyLinkedList<Integer>();
        MyLinkedList<Integer> newLinkedList2 = new MyLinkedList<Integer>();
        for (int n: arr1) {
            newLinkedList1.add(n);
        }
        for (int n: arr2) {
            newLinkedList2.add(n);
        }
        ListNode<Integer> mergedListNode = mergeTwoLists(newLinkedList1.head, newLinkedList2.head);
        while (mergedListNode != null) {
            System.out.println(mergedListNode.val);
            mergedListNode = mergedListNode.next;
        }
    }

    public static ListNode<Integer> mergeTwoLists(ListNode<Integer> node1, ListNode<Integer> node2) {
        ListNode<Integer> currentNode = new ListNode<>(Integer.MIN_VALUE);
        ListNode<Integer> headNode = currentNode;
        while (node1 != null && node2 != null) {
            if (node1.val <= node2.val) {
                currentNode.next = node1;
                node1 = node1.next;
            } else {
                currentNode.next = node2;
                node2 = node2.next;
            }
            currentNode = currentNode.next;
        }
        if (node1 == null) {
            currentNode.next = node2;
        } else if (node2 == null) {
            currentNode.next = node1;
        }

        return headNode.next;
    }
}

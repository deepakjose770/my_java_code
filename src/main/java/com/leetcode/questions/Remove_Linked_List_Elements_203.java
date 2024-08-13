package com.leetcode.questions;

import com.deepak.util.ListNode;

import java.util.List;

public class Remove_Linked_List_Elements_203 {
    public static void main(String[] args) {
        int[] nums = {1,2,6,3,4,5,6};
        ListNode<Integer> head = ListNode.getListNode(nums);
        ListNode.printList(head);
        head = removeElements(head, 6);
        ListNode.printList(head);
    }

    public static ListNode<Integer> removeElements(ListNode<Integer> head, int val) {
        ListNode<Integer> dummyNode = new ListNode<>(-1);
        dummyNode.next = head;
        ListNode<Integer> currentNode = dummyNode;
        while (currentNode.next != null) {
            if (currentNode.next.val == val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return dummyNode.next;
    }
}

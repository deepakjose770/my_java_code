package com.deepak.general;

import com.deepak.util.ListNode;

public class ReverseNodesInKGroup_25 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        ListNode<Integer> head = ListNode.getListNode(nums);
        head = reverseKGroup(head, 2);
        ListNode.printList(head);
    }

    public static ListNode<Integer> reverseKGroup(ListNode<Integer> head, int k) {
        ListNode<Integer> pointerOne = head;
        ListNode<Integer> pointerTwo = head;


        return null;
    }
}

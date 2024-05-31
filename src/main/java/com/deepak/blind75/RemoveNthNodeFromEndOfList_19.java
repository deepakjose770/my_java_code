package com.deepak.blind75;

import com.deepak.util.ListNode;

public class RemoveNthNodeFromEndOfList_19 {
    public static void main(String[] args) {
        int[] nums = {1};
        ListNode<Integer> head = ListNode.getListNode(nums);
        ListNode.printList(head);
        head = removeNthFromEnd(head, 1);
        ListNode.printList(head);
    }

    private static ListNode<Integer> removeNthFromEnd(ListNode<Integer> head, int n) {
        ListNode<Integer> dummy = new ListNode<>(Integer.MIN_VALUE);
        dummy.next = head;

        ListNode<Integer> firstPointer = dummy;
        ListNode<Integer> secondPointer = dummy;
        secondPointer = setSecondPointer(secondPointer, n);
        while (secondPointer.next != null) {
            firstPointer = firstPointer.next;
            secondPointer= secondPointer.next;
        }
        firstPointer.next = firstPointer.next.next;
        return head;
    }

    private static ListNode<Integer> setSecondPointer(ListNode<Integer> head, int i) {
        for (int j = 0; j < i; j++) {
            head = head.next;
        }
        return head;
    }
}

package com.deepak.blind75;

import com.deepak.util.ListNode;

import java.util.List;

public class ReorderList_143 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        ListNode<Integer> head = ListNode.getListNode(nums);
        //reorderList(head);
        //ListNode.printList(head);

        ListNode<Integer> slowPointer = head;
        ListNode<Integer> fastPointer = head.next;

        while (fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer= fastPointer.next.next;
        }


        ListNode<Integer> partTwoHead = slowPointer.next;
        ListNode<Integer> previousNode = null;

        while (partTwoHead != null) {
            ListNode<Integer>  nextNode = partTwoHead.next;
            partTwoHead.next = previousNode;
            previousNode = partTwoHead;
            partTwoHead= nextNode;
        }
        partTwoHead = previousNode;

        ListNode<Integer> finalList = head;
        while (partTwoHead != null) {
            ListNode<Integer> temp = head.next;
            head.next = partTwoHead;
            head.next.next = temp;
            partTwoHead = partTwoHead.next;
            head = temp;
        }
        ListNode.printList(finalList);

    }

    static void reorderList(ListNode head) {

        if (head == null || head.next == null) // base case
            return;

        ListNode p1 = head;
        ListNode p2 = head;
        while (p2.next != null && p2.next.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }

        // Reverse the half after middle
        ListNode preMiddle = p1;
        ListNode preCurrent = p1.next;
        while (preCurrent.next != null) {
            ListNode current = preCurrent.next;
            preCurrent.next = current.next;
            current.next = preMiddle.next;
            preMiddle.next = current;
        }

        // Start reordering
        p1 = head;
        p2 = preMiddle.next;
        while (p1 != preMiddle) {
            preMiddle.next = p2.next;
            p2.next = p1.next;
            p1.next = p2;
            p1 = p2.next;
            p2 = preMiddle.next;
        }
    }
}

package com.deepak.blind75;

import com.deepak.util.ListNode;

import java.util.List;

public class ReorderList_143 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        ListNode<Integer> head = ListNode.getListNode(nums);
        //reorderList(head);
        //ListNode.printList(head);

        ListNode<Integer> slowPointer = head;
        ListNode<Integer> fastPointer = head;

        while (fastPointer.next != null &&
                fastPointer.next.next != null) {
            slowPointer = slowPointer.next;
            fastPointer= fastPointer.next.next;
        }


        ListNode<Integer> partTwoHead = slowPointer;
        ListNode<Integer> previousNode = null;

        while (partTwoHead != null) {
            ListNode<Integer>  nextNode = partTwoHead.next;
            partTwoHead.next = previousNode;
            previousNode = partTwoHead;
            partTwoHead= nextNode;
        }
        partTwoHead = previousNode;
        ListNode<Integer> partOneHead = head;

        ListNode<Integer> temp = null;
        while (partTwoHead.next != null) {
            temp = partOneHead.next;
            partOneHead.next = partTwoHead;
            partOneHead = temp;

            temp  = partTwoHead.next;
            partTwoHead.next = partOneHead;
            partTwoHead = temp;

        }
        ListNode.printList(head);

    }

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }


        ListNode prev = null, curr = slow, tmp;
        while (curr != null) {
            tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }


        ListNode first = head, second = prev;
        while (second.next != null) {
            tmp = first.next;
            first.next = second;
            first = tmp;

            tmp = second.next;
            second.next = first;
            second = tmp;
        }
    }
}

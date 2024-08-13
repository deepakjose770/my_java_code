package com.leetcode.questions;

import com.deepak.util.ListNode;

public class Palindrome_Linked_List_234 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1,5};
        ListNode<Integer> head = ListNode.getListNode(nums);
        ListNode.printList(head);
        System.out.println("The list is palndrome is "+ isPalindrome(head));
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode<Integer> slowPointer = head;
        ListNode<Integer> fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        //Reversing Second half of the linked list
        ListNode<Integer> previous = null;
        ListNode<Integer> current = slowPointer;
        while (current != null) {
            ListNode<Integer> temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }

        ListNode<Integer> firstHalfFilter = head;
        ListNode<Integer> secondHalfFilter = previous;

        while (secondHalfFilter != null) {
            if (secondHalfFilter.val != firstHalfFilter.val) {
                return false;
            }
            firstHalfFilter = firstHalfFilter.next;
            secondHalfFilter = secondHalfFilter.next;
        }
        return true;
    }
}

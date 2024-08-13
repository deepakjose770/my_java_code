package com.deepak.util;

import java.util.HexFormat;
import java.util.List;

public class ListNode<T> {
    public T val;
    public ListNode<T> next;

    public ListNode(T val) {
        this.val = val;
        this.next = null;
    }

     public ListNode(T val, ListNode<T> listNode) {
        this.val = val;
        this.next = listNode;
    }

    public static ListNode<Integer> getListNode(int[] nums) {
        ListNode<Integer> head= new ListNode<>(nums[0], null);
        ListNode<Integer> finalHead = head;
        for (int i = 1; i < nums.length; i++) {
            head.next = new ListNode<>(nums[i], null);
            head = head.next;
        }
        return finalHead;
    }

    public static ListNode<Integer> getLastNode(ListNode<Integer> head) {
        while(head.next != null) {
            head = head.next;
        }
        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head= head.next;
        }
        System.out.println();
    }
}

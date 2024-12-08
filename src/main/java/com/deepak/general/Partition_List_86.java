package com.deepak.general;

import com.deepak.util.ListNode;

public class Partition_List_86 {
    public ListNode<Integer> partition(ListNode<Integer> head, int x) {
        ListNode<Integer> minList = new ListNode<>(-1);
        ListNode<Integer> maxList = new ListNode<>(-1);
        ListNode<Integer> minTail = minList;
        ListNode<Integer> maxTail = maxList;

        while (head != null) {
            if (head.val <x) {
                minTail.next = head;
                minTail = minTail.next;
            }
            if (head.val >= x) {
                maxTail.next = head;
                maxTail = maxTail.next;
            }
            head = head.next;
        }
        minTail.next = maxList.next;
        maxTail.next = null;
        return minList.next;
    }
}

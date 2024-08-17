package com.deepak.general;

import com.deepak.util.ListNode;

public class Midle_of_Linked_List_876 {
    public ListNode middleNode(ListNode head) {
        ListNode firstPointer = head;
        ListNode secondPointer = head;

        while (secondPointer != null && secondPointer.next != null) {
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next.next;
        }
        return firstPointer;
    }
}

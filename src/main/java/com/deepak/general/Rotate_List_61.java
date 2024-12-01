package com.deepak.general;

import com.deepak.util.ListNode;

import java.util.List;

public class Rotate_List_61 {

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        ListNode result1 = new Rotate_List_61().rotateRight(head1, 2);
    }


    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k ==0) {
            return head;
        }

        int listLength = 1;
        ListNode tempNode = head;
        while (tempNode.next!= null) {
            tempNode = tempNode.next;
            listLength++;
        }

        int effectiveRotation = k % listLength;
        int newTailLocation = listLength - effectiveRotation - 1;
        tempNode.next = head;

        tempNode = head;
        for (int i = 0; i < newTailLocation; i++) {
            tempNode = tempNode.next;
        }
        head = tempNode.next;
        tempNode.next = null;
        return head;
    }
}

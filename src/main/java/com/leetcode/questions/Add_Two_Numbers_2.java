package com.leetcode.questions;

import java.util.List;

public class Add_Two_Numbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode3 = new ListNode(0);
        ListNode listNode1 = l1;
        ListNode listNode2 = l2;
        ListNode current = listNode3;
        int carry = 0;
        while (listNode1 != null || listNode2 != null) {
            int x = (listNode1 != null) ? listNode1.val : 0;
            int y = (listNode2 != null) ? listNode2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (listNode1 != null) {
                listNode1 = listNode1.next;
            }
            if (listNode2 != null) {
                listNode2 = listNode2.next;
            }
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return listNode3.next;
    }

    public static void main(String[] args) {
        Add_Two_Numbers_2 solution = new Add_Two_Numbers_2();

        // Test data: 342 + 465 = 807
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }
    }
}


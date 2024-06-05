package com.deepak.general;

import com.deepak.util.ListNode;

public class AddTwoNumbers_2 {
    public static void main(String[] args) {
        int[] numsOne = {9,9,9,9,9,9,9};
        int[] numsTwo = {9,9,9,9};
        ListNode<Integer> nodeOne = ListNode.getListNode(numsOne);
        ListNode<Integer> nodeTwo = ListNode.getListNode(numsTwo);
        ListNode.printList(addTwoNumbers(nodeOne, nodeTwo));


    }

    public static ListNode<Integer> addTwoNumbers(ListNode<Integer> l1, ListNode<Integer> l2) {
        ListNode<Integer> result = new ListNode<>(Integer.MIN_VALUE);
        ListNode<Integer> pointer = result;

        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = carry;

            if(l1 != null) {
                sum = sum + l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                sum = sum + l2.val;
                l2 = l2.next;
            }

            carry = sum/10;
            sum = sum%10;
            pointer.next = new ListNode<>(sum);
            pointer = pointer.next;
        }
        if (carry == 1) {
            pointer.next = new ListNode<>(carry);
        }
        return result.next;
    }
}

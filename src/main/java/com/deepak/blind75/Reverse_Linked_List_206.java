package com.deepak.blind75;

import com.deepak.util.DpkStack;
import com.deepak.util.ListNode;

public class Reverse_Linked_List_206 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println("After stack reversal");
        ListNode<Integer> listForStack = ListNode.getListNode(nums);
        listForStack = reverseListByStack(listForStack);
        ListNode.printList(listForStack);

        System.out.println("After optmized reversal");
        ListNode<Integer> listForOptimizedReversal = ListNode.getListNode(nums);
        listForOptimizedReversal = optimizedReverse(listForOptimizedReversal);
        ListNode.printList(listForOptimizedReversal);
    }

    private static ListNode<Integer> reverseListByStack(ListNode<Integer> head) {
        DpkStack<Integer> stack = new DpkStack<Integer>(10);
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        ListNode<Integer> reversedList = new ListNode<>(Integer.MIN_VALUE);
        ListNode<Integer> pointerList = reversedList;
        while (!stack.isEmpty()) {
            pointerList.next = new ListNode<>(stack.pop());
            pointerList =pointerList.next;
        }
        return reversedList.next;
    }

    private static ListNode<Integer> optimizedReverse(ListNode<Integer> head) {
        if (head == null) {
            return null;
        }

        if(head.next == null) {
            return head;
        }


        ListNode<Integer> currentNode = head;
        ListNode<Integer> previousNode = null;


        while (currentNode != null) {
            ListNode<Integer>  nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode =  nextNode;
        }

        head = previousNode;
        return head;

    }
}

package com.deepak.general;

import com.deepak.util.ListNode;

public class Remove_Duplicates_From_Sorted_List_83 {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        ListNode<Integer> head = ListNode.getListNode(nums);
        head = deleteDuplicates(head);
        while (head.next == null) {
            System.out.print(head.val + "  ");
            head= head.next;
        }
    }

    private static ListNode<Integer> deleteDuplicates(ListNode<Integer> head) {
        ListNode<Integer> currentNode = head;

        while (currentNode!= null && currentNode.next != null) {
            if(currentNode.val == currentNode.next.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }

        return head;
    }
}

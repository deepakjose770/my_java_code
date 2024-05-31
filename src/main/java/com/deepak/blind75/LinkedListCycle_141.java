package com.deepak.blind75;

import com.deepak.util.ListNode;

public class LinkedListCycle_141 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        ListNode<Integer> head = ListNode.getListNode(nums);
        ListNode<Integer> last =  ListNode.getLastNode(head);
        //last.next = head.next.next;
        System.out.println("The list have a cycle " + hasCycle(head));
    }

    public static boolean hasCycle(ListNode<Integer> head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode<Integer> slow = head;
        ListNode<Integer> fast = head.next;
        while (slow != fast) {
            if(fast == null || slow == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}

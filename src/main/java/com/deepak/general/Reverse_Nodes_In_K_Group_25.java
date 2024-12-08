package com.deepak.general;

import com.deepak.util.ListNode;

public class Reverse_Nodes_In_K_Group_25 {
    public ListNode<Integer> reverseKGroup(ListNode<Integer> head, int k) {
        ListNode<Integer> dummyNode = new ListNode<>(0);
        dummyNode.next = head;
        
        ListNode<Integer> previous = dummyNode;
        ListNode<Integer> current = dummyNode;
        
        while (current.next != null) {
            for (int i = 0; i < k && current != null; i++) {
                current = current.next;
            }
            
            if (current == null) {
                return dummyNode.next;
            }
            
            ListNode<Integer> nextNode = current.next;
            current.next = null;

            ListNode<Integer> startNode = previous.next;

            
            previous.next = reverseList(startNode);
            
            startNode.next = nextNode;

            previous = startNode;
            current = previous;
        }
        return dummyNode.next;
    }

    private ListNode<Integer> reverseList(ListNode<Integer> startNode) {
        ListNode<Integer> previous = null;
        ListNode<Integer> currentNode = startNode;
        while (currentNode != null) {
            ListNode<Integer> nextNode = currentNode.next;
            currentNode.next = previous;
            previous = currentNode;
            currentNode = nextNode;
        }
        return previous;
    }


    public static void main(String[] args) {
        // Create example 1
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        ListNode result1 = new Reverse_Nodes_In_K_Group_25().reverseKGroup(head1, 2);
        /*printList(result1); // Expected output: 2 -> 1 -> 4 -> 3 -> 5

        // Create example 2
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);

        ListNode result2 = solution.reverseKGroup(head2, 3);
        printList(result2); // Expected output: 3 -> 2 -> 1 -> 4 -> 5*/
    }
}

package com.deepak.general;

import com.deepak.util.ListNode;

import java.util.PriorityQueue;

public class Merge_k_Sorted_Lists_23 {
    public ListNode<Integer> mergeKLists(ListNode<Integer>[] lists) {
        PriorityQueue<ListNode<Integer>> minHeap = new PriorityQueue<>((a,b) ->  a.val - b.val);

        for (ListNode<Integer> node: lists) {
            if (node != null) {
                minHeap.offer(node);
            }
        }

        ListNode<Integer> dummy = new ListNode<>(0);
        ListNode<Integer> current = dummy;

        while (!minHeap.isEmpty()) {
            ListNode<Integer> minNode = minHeap.poll();
            current.next = minNode;
            current = current.next;
            if (minNode.next != null) {
                minHeap.offer(minNode.next);
            }
        }
        return dummy.next;
    }
}

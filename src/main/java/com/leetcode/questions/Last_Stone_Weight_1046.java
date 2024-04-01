package com.leetcode.questions;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Last_Stone_Weight_1046 {
    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeightMine(stones));
    }

    public static int lastStoneWeightMine(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i:
                stones) {
            maxHeap.add(i);
        }

        while (maxHeap.size() >1) {
            int largest = maxHeap.remove();
            int secondLargest = maxHeap.remove();
            if(largest > secondLargest) {
                maxHeap.add(largest - secondLargest);
            }
        }

        return maxHeap.isEmpty() ? 0:maxHeap.remove();
    }
}

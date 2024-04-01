package com.deepak.Q150.Easy;

import java.util.PriorityQueue;

public class _703_Kth_Largest_Element {
    public static void main(String[] args) {
        int[] nums = {4,6,3,7,2,12,18};
        _703_Kth_Largest_Element obj = new _703_Kth_Largest_Element(3, nums);
        System.out.println(obj.add(1));
    }


    private final int k;
    private PriorityQueue<Integer> minHeap;

    public _703_Kth_Largest_Element(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        minHeap.add(val);
        if (minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}

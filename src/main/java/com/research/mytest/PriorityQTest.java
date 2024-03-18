package com.research.mytest;

import java.util.PriorityQueue;

public class PriorityQTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> intQ = new PriorityQueue<>();
        intQ.add(5);
        intQ.add(2);
        intQ.add(8);
        intQ.add(3);
        System.out.println(intQ);
    }
}

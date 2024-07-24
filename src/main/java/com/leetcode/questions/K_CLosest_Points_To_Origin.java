package com.leetcode.questions;

import java.util.Arrays;
import java.util.PriorityQueue;

public class K_CLosest_Points_To_Origin {
    public static void main(String[] args) {
        int[][] points = {{1,3}, {-2,2}};
        int k = 1;
        int[][] result = kClosest(points, k);
        System.out.println(Arrays.deepToString(result));
    }

    private static int[][] kClosest(int[][] points, int k) {
        if (points.length == 1) {
            return points;
        }

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
                (a,b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]));

        for(int[] point : points) {
            maxHeap.add(point);
            if (maxHeap.size() >k) {
                maxHeap.poll();
            }
        }

        int[][] result = new int[k][2];
        for (int i =0; i < k; i++) {
            result[i] = maxHeap.poll();
        }
        return result;
    }
}

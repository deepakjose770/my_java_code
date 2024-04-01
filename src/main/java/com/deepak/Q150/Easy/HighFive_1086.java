package com.deepak.Q150.Easy;

import java.util.*;

public class HighFive_1086 {
    public static void main(String[] args) {
        int[][] items = {{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};
        //System.out.println(Arrays.asList(highFive(items)));
    }


    public static int[][] highFive(int[][] items) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();

        for (int[] item : items) {
            int studentId = item[0];
            int score = item[1];

            // Create a min-heap for the student if it doesn't exist
            map.putIfAbsent(studentId, new PriorityQueue<>((a, b) -> a - b));

            // Add the score to the heap (maintain only top 5)
            PriorityQueue<Integer> studentHeap = map.get(studentId);
            if (studentHeap.size() < 5) {
                studentHeap.add(score);
            } else if (score > studentHeap.peek()) {
                studentHeap.poll();
                studentHeap.add(score);
            }
        }

        // Calculate average for each student and add to result
        for (Map.Entry<Integer, PriorityQueue<Integer>> entry : map.entrySet()) {
            int studentId = entry.getKey();
            PriorityQueue<Integer> studentHeap = entry.getValue();

            int sum = 0;
            while (!studentHeap.isEmpty()) {
                sum += studentHeap.poll();
            }

            int average = sum / 5;
            result.add(new int[]{studentId, average});
        }

        return result.toArray(new int[result.size()][]);
    }
}

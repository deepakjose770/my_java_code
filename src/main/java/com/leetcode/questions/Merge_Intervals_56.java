package com.leetcode.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Intervals_56 {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] merged = merge(intervals);
        System.out.println(Arrays.deepToString(merged));
    }

    private static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][0];
        }

        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> mergedList = new ArrayList<>();

        int[] currentInterval  = intervals[0];
        mergedList.add(currentInterval);

        for(int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if(currentEnd >= nextStart) {
                currentInterval[1] = Math.max(nextEnd, currentEnd);
            } else {
                currentInterval = interval;
                mergedList.add(currentInterval);
            }
        }
        return mergedList.toArray(new int[mergedList.size()][]);
    }
}

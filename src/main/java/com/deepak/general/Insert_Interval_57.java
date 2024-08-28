package com.deepak.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Insert_Interval_57 {
    public static void main(String[] args) {
        int[][] intervals2 = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval2 = {4, 8};
        //int[][] result2 = insert(intervals2, newInterval2);
        //System.out.println(Arrays.deepToString(result2));

        String abc = "==b=c=d";
        int index = abc.indexOf("=");
        System.out.println("The result"+ index);
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> resultArrayList = new ArrayList<>();
        int arrayLength = intervals.length;
        int i = 0;


        while (i<arrayLength && intervals[i][1] < newInterval[0]) {
            resultArrayList.add(intervals[i]);
            i++;
        }

        while (i<arrayLength && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }

        resultArrayList.add(newInterval);

        while (i<arrayLength) {
            resultArrayList.add(intervals[i]);
            i++;
        }

        return resultArrayList.toArray(new int[resultArrayList.size()][]);
    }
}

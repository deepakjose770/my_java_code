package com.deepak.general;

import java.util.List;

public class Triangle_120 {
    public static void main(String[] args) {
        List<List<Integer>> triangle = List.of(List.of(2), List.of(3, 4), List.of(6, 5, 7), List.of(4, 1, 8, 3));
        System.out.println(minimumTotal(triangle));
    }

    static int minimumTotal(List<List<Integer>> triangle) {
        int height = triangle.size();
        int[][] dp = new int[height + 1][height + 1];

        for (int level = height -1; level >= 0; level--) {
            for (int i = 0; i <= level; i++) {
                dp[level][i] = triangle.get(level).get(i) + Math.min(dp[level + 1][i], dp[level + 1][i+1]);
            }
        }

        return dp[0][0];
    }
}

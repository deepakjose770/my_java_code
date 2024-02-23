package com.deepak.weekOne;

public class MaximumPopulationYear {
    public static void main(String[] args) {
        int[][] logs = {{1950,1961},{1960,1971},{1970,1981}};
        System.out.println(maximumPopulation(logs));
    }

    private static int maximumPopulation(int[][] logs) {
        int minYear = 1950, maxYear = 2050; // Adjust according to problem constraints
        int[] diff = new int[maxYear - minYear + 1];

        for (int[] log : logs) {
            diff[log[0] - minYear]++; // Increment birth year
            diff[log[1] - minYear] -= 1; // Decrement death year (next year)
        }

        int maxPop = 0, year = minYear;
        int prefixSum = 0;
        for (int i = 0; i < diff.length; i++) {
            prefixSum += diff[i];
            if (prefixSum > maxPop) {
                maxPop = prefixSum;
                year = i + minYear;
            }
        }

        return year;
    }
}

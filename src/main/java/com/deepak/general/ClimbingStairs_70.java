package com.deepak.general;

public class ClimbingStairs_70 {
    public static void main(String[] args) {
        int n =25;
        System.out.println("The number of ways " + solutionUsingArray(n));
        System.out.println("The number of ways " + solutionUsingVariables(n));
    }

    private static int solutionUsingVariables(int n) {
        if(n < 3) {
            return n;
        }

        int firstPreviousValue = 2;
        int secondpreviousValue = 1;
        int numberOfPossibilities = 0;
        for (int i = 3; i <= n; i++) {
            numberOfPossibilities = firstPreviousValue + secondpreviousValue;
            secondpreviousValue = firstPreviousValue;
            firstPreviousValue = numberOfPossibilities;
        }
        return numberOfPossibilities;
    }

    private static int solutionUsingArray(int n) {
        if(n == 1) {
            return 1;
        }

        int[] counts = new int[n + 1];
        counts[1] = 1;
        counts[2] = 2;

        for (int i =3; i<= n; i++) {
            counts[i] = counts[i - 1] + counts[i - 2];
        }
        return counts[n];
    }
}

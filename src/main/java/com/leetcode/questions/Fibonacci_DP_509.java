package com.leetcode.questions;

public class Fibonacci_DP_509 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("The fib of n = "+ fib(n));
    }

    private static int fib(int n) {
        if(n == 0) {
            return 0;
        }
        int previous = 1;
        int beforePrevious = 0;
        int count  = 2;
        int newVal = 1;
        while (count <=n) {
            newVal = previous + beforePrevious;
            beforePrevious  = previous;
            previous = newVal;
            count++;
        }
        return newVal;
    }
}

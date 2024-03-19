package com.deepak.general;

public class Fibonacci {
    public static void main(String[] args) {
        int fibLen = 50;
        System.out.print("Fibonacc Series of " + fibLen +" numbers is :");
        for (int i = 0; i < fibLen; i++) {
            System.out.print(fibonacciRecursion(i) + " ");
        }
    }

    private static int fibonacciRecursion(int count) {
        if (count ==0) {
            return 0;
        }
        if(count == 1 || count==2) {
            return 1;
        }

        return fibonacciRecursion(count-1) + fibonacciRecursion(count-2);
    }
}

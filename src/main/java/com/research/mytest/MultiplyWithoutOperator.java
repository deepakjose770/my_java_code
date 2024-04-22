package com.research.mytest;

public class MultiplyWithoutOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int result = multiply(a, b);
        System.out.println("Result: " + result);
    }

    private static int multiply(int a, int b) {
        if(a == 0) {
            return 0;
        }
    }

}

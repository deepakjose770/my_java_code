package com.deepak.blind75;

public class Sum_Of_Two_Integers_371 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(getSum(a, b));
    }

    private static int getSum(int a, int b) {
        while(b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
}

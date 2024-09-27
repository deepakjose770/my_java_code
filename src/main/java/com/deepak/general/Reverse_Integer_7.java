package com.deepak.general;

public class Reverse_Integer_7 {
    public int reverse(int x) {
        int reverseNumber = 0;
        while (x != 0) {
            int pop = x % 10;
            x=x/10;
            if (reverseNumber > Integer.MAX_VALUE/10 || (reverseNumber == Integer.MAX_VALUE/10 && pop > 7)) {
                return 0;
            }
            if (reverseNumber < Integer.MIN_VALUE/10 || (reverseNumber == Integer.MIN_VALUE/10 && pop < -8)) {
                return 0;
            }
            reverseNumber = reverseNumber * 10 + pop;
        }
        return reverseNumber;
    }
}

package com.deepak.general;

public class Happy_Number_202 {
    public boolean isHappy(int n) {
        int slowPointer = n;
        int fastPointer = getDigitSquared(n);

        while (fastPointer != slowPointer) {
            slowPointer = getDigitSquared(slowPointer);
            fastPointer = getDigitSquared(getDigitSquared(fastPointer));
        }
        return slowPointer == 1;
    }

    int getDigitSquared(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n%10;
            sum = sum + digit*digit;
            n =  n/10;
        }
        return sum;
    }
}

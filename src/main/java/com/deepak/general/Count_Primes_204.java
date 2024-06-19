package com.deepak.general;

import java.util.Arrays;

public class Count_Primes_204 {
    public static void main(String[] args) {
        System.out.println(countPrimes(10)); // Output: 4
        System.out.println(countPrimes(20)); // Output: 8
    }

    private static int countPrimes(int n) {
        if (n <= 2 ) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        for (int i =2; i*i <n; i++) {
            if(isPrime[i]) {
                for (int j = i*i; j < n; j= j+i) {
                    isPrime[j] = false;
                }
            }
        }

        int count =0;
        for(int i=2; i<n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }
}

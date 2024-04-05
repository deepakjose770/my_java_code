package com.leetcode.questions;

public class PoliceThiefProblem {
    public static void main(String[] args) {
        char[] ch = {'P','T','T','P', 'T'};
        int k = 1;
        System.out.println("No is " + maxThievesCaught(ch,k));
    }

    public static int maxThievesCaught(char[] arr, int k) {
        int thievesCaught = 0;
        int currentPoliceman = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'P') {
                currentPoliceman = i;
            } else if (arr[i] == 'T' && currentPoliceman != -1 && Math.abs(i - currentPoliceman) <= k) {
                thievesCaught++;
                currentPoliceman = -1;
            }
        }

        return thievesCaught;
    }


}

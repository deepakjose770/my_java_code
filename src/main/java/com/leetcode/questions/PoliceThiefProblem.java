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

/*
*
*
*
Each element in the array contains either a policeman or a thief.
Each policeman can catch only one thief.
A policeman cannot catch a thief who is more than K units away from the policeman.
We need to find the maximum number of thieves that can be caught.
Examples:


Input : arr[] = {'P', 'T', 'T', 'P', 'T'},
      k = 1.
Output : 2.
Here maximum 2 thieves can be caught, first
policeman catches first thief and second police-
man can catch either second or third thief.

Input : arr[] = {'T', 'T', 'P', 'P', 'T', 'P'},
      k = 2.
Output : 3.

Input : arr[] = {'P', 'T', 'P', 'T', 'T', 'P'},
      k = 3.
Output : 3.
*
* */

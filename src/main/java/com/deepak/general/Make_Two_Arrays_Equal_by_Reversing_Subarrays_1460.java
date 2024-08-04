package com.deepak.general;

import java.util.Arrays;
import java.util.HashMap;

public class Make_Two_Arrays_Equal_by_Reversing_Subarrays_1460 {
    public static void main(String[] args) {
        int[] target = {1,1,1,2,3,4};
        int[] arr = {2,4,3,1,1,1};
        boolean yes = canBeEqual(target,arr);
    }

    public boolean canBeEqual2(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }

    public boolean canBeEqual1(int[] target, int[] arr) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int num : target) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (!count.containsKey(num) || count.get(num) == 0) {
                return false;
            }
            count.put(num, count.get(num) - 1);
        }

        return true;
    }

    public static boolean canBeEqual(int[] target, int[] arr) {
        int[] elementCounts = new int[1001];
        int uniqueCount = 0;

        for (int i = 0; i < target.length; i++) {
            if (elementCounts[target[i]]++ == 0) {
                uniqueCount++;
            }
            if (elementCounts[arr[i]]-- == 1) {
                uniqueCount--;
            }
        }

        return uniqueCount == 0;
    }


}

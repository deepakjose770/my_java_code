package com.deepak.general;

public class KokoEatingBananas_875 {
    public static void main(String[] args) {
        int[]  nums = {3,6,7,11};
        int h = 8;
        System.out.println("The number of bananas are "+ minEatingSpeed(nums, h));
    }

    private static int minEatingSpeed(int[] piles, int h) {
        int maxSpeed = 0;
        for (int num:piles) {
            maxSpeed = Math.max(maxSpeed, num);
        }

        int minSpeed = 1;
        while (minSpeed < maxSpeed) {
            int mid = (minSpeed + maxSpeed)/2;

            if (canEatInTime(piles, h, mid)) {
                maxSpeed = mid;
            } else {
                minSpeed = mid + 1;
            }
        }
        return minSpeed;
    }

    private static boolean canEatInTime(int[] piles, int h, int mid) {
        int hours = 0;
        for (int pile : piles) {
            hours = hours + (int)Math.ceil((double) pile/mid);
        }
        return hours <= h;
    }
}

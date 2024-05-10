package com.leetcode.questions;

import java.util.Arrays;

public class Koko_Eating_Bananas_875 {
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 5;
        System.out.println("The number is "+ minEatingSpeed(piles, h));
    }

    private static int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;
        int maxSpeed = 0;
        int speed = 0;
        maxSpeed = Arrays.stream(piles).max().getAsInt();

        while (minSpeed < maxSpeed) {
            speed = (minSpeed + maxSpeed)/2;

            if(moreHoursUsed(speed, piles, h)){
                minSpeed = speed + 1;
            } else {
                maxSpeed = speed-1;
            }
        }
        return speed;
    }

    private static boolean moreHoursUsed(int speed, int[] piles, int h) {
        int totalHour= 0;
        for (int pile: piles) {
            totalHour = totalHour + (int)Math.ceil(pile/speed);
        }
        return totalHour > h;
    }


    static int minEatingSpeedO(int[] piles, int h) {
        int minSpeed = 1;

        // Find max pile size
        int maxSpeed = 0;
        for (int pile : piles)
            maxSpeed = Math.max(maxSpeed, pile);

        // Binary search
        while (minSpeed < maxSpeed) {
            int mid = minSpeed + (maxSpeed - minSpeed) / 2;

            if (canEatInTime0(piles, h, mid))
                maxSpeed = mid;
            else
                minSpeed = mid + 1;
        }
        return minSpeed;
    }

    private static boolean canEatInTime0(int[] piles, int h, int speed) {
        int hours = 0;
        for(int pile : piles)
            hours += (int) Math.ceil((double) pile / speed);

        return hours <= h;
    }
}

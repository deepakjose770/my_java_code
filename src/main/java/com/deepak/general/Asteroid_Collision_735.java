package com.deepak.general;

import java.util.Arrays;
import java.util.Stack;

public class Asteroid_Collision_735 {
    public static void main(String[] args) {
        int[] numsOne = {5,10,-5};
        int[] numsTwo = {10,2,-5};
        System.out.println("The list is "+ Arrays.toString(asteroidCollision(numsOne)));
    }

    private static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            boolean exploded = false;

        }
        int result[] = new int[stack.size()];
        return result;
    }
}

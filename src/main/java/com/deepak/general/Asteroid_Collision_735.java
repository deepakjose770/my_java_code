package com.deepak.general;

import java.util.Arrays;
import java.util.Stack;

public class Asteroid_Collision_735 {
    public static void main(String[] args) {
        int[] numsOne = {5, 10, -5};
        int[] numsTwo = {10, 2, -5};
        System.out.println("The list is " + Arrays.toString(asteroidCollision(numsOne)));
        System.out.println("The list is " + Arrays.toString(asteroidCollision(numsTwo)));
    }

    private static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            boolean exploded = false;
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (stack.peek() < -asteroid) {
                    stack.pop();
                    continue;
                } else if (stack.peek() == -asteroid) {
                    stack.pop();
                }
                exploded = true;
                break;
            }
            stack.push(asteroid);
        }
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}

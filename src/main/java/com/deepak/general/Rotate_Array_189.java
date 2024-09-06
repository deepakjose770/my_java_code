package com.deepak.general;

public class Rotate_Array_189 {

    public static void main(String[] args) {
        Rotate_Array_189 solution = new Rotate_Array_189();

        // Test case 1
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        solution.rotate(nums1, k1);
        System.out.println("Rotated array 1: " + java.util.Arrays.toString(nums1)); // Expected: [5, 6, 7, 1, 2, 3, 4]

        // Test case 2
        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        solution.rotate(nums2, k2);
        System.out.println("Rotated array 2: " + java.util.Arrays.toString(nums2)); // Expected: [3, 99, -1, -100]
    }

    public void rotate(int[] nums, int k) {
        int arrayLength = nums.length;
         k = k % arrayLength;
         reverseArray(nums, 0, arrayLength-1);
         reverseArray(nums, 0, k-1);
         reverseArray(nums, k, arrayLength-1);
    }

    private void reverseArray(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}

package com.deepak.blind75;

public class MaxWaterContainer {
    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(heights));
    }

    private static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right){
            int area = Math.min(height[left], height[right]) * (right-left);
            maxArea = Math.max(area, maxArea);

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}

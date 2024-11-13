package com.deepak.general;

public class Jump_Game_2_45 {
    public int jump(int[] nums) {
        int farthest = 0;
        int jumps = 0;
        int currentJumpPosition = 0;
        for (int i=0;i <nums.length-1;i++) {
            farthest = Math.max(farthest,i+nums[i]);
            if (i==currentJumpPosition) {
                jumps++;
                currentJumpPosition = farthest;
            }
        }
        return jumps;
    }
}

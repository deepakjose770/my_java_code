package com.deepak.general;

public class Partition_Equal_Subset_Sum_416 {
    public static void main(String[] args) {
        int[] nums = {1,2,5};
        System.out.println(new Partition_Equal_Subset_Sum_416().canPartition(nums));
    }

    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        for(int i : nums) {
            totalSum = totalSum + i;
        }
        if (totalSum % 2 != 0) {
            return false;
        }

        int targetSum = totalSum/2;

        boolean[] subSetSum = new boolean[targetSum + 1];
        subSetSum[0] = true;

        for (int num : nums) {
            for (int i = targetSum; i >= num; i--) {
                subSetSum[i] = subSetSum[i] || subSetSum[i - num];
            }
        }
        return subSetSum[targetSum];
    }
}

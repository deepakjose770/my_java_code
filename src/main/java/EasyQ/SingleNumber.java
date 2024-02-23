package EasyQ;

import java.util.HashMap;
import java.util.Map;

//Leetcode 136
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,1,4,4};
        System.out.println(singleNumber(nums));
        System.out.println(singleNumberUsingMap(nums));
    }

    private static int singleNumber(int[] nums) {
        int sing = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sing = sing^nums[i];
        }
        return sing;
    }

    public static int singleNumberUsingMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}

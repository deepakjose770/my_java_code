package com.deepak.general;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
//1 0 1 1
public class Contains_Duplicate_2_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i =0; i< nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }


    public boolean containsNearbyDuplicateOne(int[] nums, int k) {
        if(nums == null || nums.length < 2 || k == 0)
            return false;
        int i = 0;
        HashSet<Integer> hset = new HashSet<Integer>();
        for(int j = 0; j < nums.length; j++) {
            if(!hset.add(nums[j])){
                return true;
            }
            if(hset.size() >= k+1){
                hset.remove(nums[i++]);
            }
        }
        return false;
    }
}

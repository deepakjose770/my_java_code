package com.deepak.blind75;

import java.util.*;

public class TopKElements {
    public static void main(String[] args) {
        int nums[]  = {1,1,1,1,2,2,3,3,4};
        int k =2;
        System.out.println(Arrays.toString(topKFrequent2(nums, k)));
    }

    private static int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int n:nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0)+1);
        }

        for (int key:frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        int[] result = new int[k+1];
        int counter = 0;

        for(int pos = bucket.length -1; pos>=0 && counter<k; pos--) {
            if (bucket[pos] != null) {
                for (Integer integer :bucket[pos]) {
                    result[counter++] = integer;
                }
            }
        }

        return result;
    }


    public static int[] topKFrequent2(int[] nums, int k) {

        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }

        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        List<Integer> topK = new ArrayList<>();
        for (int pos = bucket.length - 1;pos >= 0 && topK.size() < k; pos--) {
            if (bucket[pos] != null) {
                topK.addAll(bucket[pos]);
            }
        }

        return topK.stream().mapToInt(i -> i).toArray();

    }

}

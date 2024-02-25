package com.deepak.weekOne;

import java.util.*;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] numsOne = {1,2,2,1};
        int[] numsTwo = {2,2};
        //System.out.println("The answer is "+ Arrays.toString(intersection(numsOne, numsTwo)));
        System.out.println("The answer is "+ Arrays.toString(intersection2(numsOne, numsTwo)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        List<Integer> result = new ArrayList<>();
        for (int num: nums2) {
            if(set.contains(num)) {
                result.add(num);
                set.remove(num);
            }
        }
        return result.stream().mapToInt(i->i).toArray();
    }

    public static int[] intersection2(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        int k=0;
        for(int i=0;i<nums1.length;i++)
        {
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(set.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }
        //int nums3[]=new int [set2.size()];
        /*for(int e:set2)
        {
            nums3[k]=e;
            k++;
        }*/
        //return nums3;
        int[] myArray = set2.stream().mapToInt(Number::intValue).toArray();
        return myArray;

    }
}

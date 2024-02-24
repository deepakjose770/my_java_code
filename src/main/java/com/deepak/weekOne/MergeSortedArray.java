package com.deepak.weekOne;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        merge1(null,0,null,0);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        while (i >=0 && j>=0) {
            if(nums2[j] >nums1[i]) {
                i--;
            } else {
                nums1[i+1] = nums1[i];
                nums1[i] = nums2[j];
                i--;
                j--;
            }
        }

        while (j>=0) {
            nums1[i--] = nums2[j--];
        }
    }

    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        nums1=new int[]{1,2,3,0,0,0};
        m=3;
        nums2=new int[]{2,5,6};
        n=3;

        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }

        /*for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);*/


        System.out.println(Arrays.toString(nums1));
    }
}

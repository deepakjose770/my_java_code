package com.deepak.general;

import java.util.Arrays;

public class MergeSortedArray_88 {
    public static void main(String[] args) {
        int[] nums1 = {4,5,10,0,0,0};
        int[] nums2 = {6,7,8};
        int m = 3;
        int n = 3;
        merge(nums1, nums2,m,n);
        System.out.println("The merged array is "+ Arrays.toString(nums1));
    }

    private static void merge(int[] nums1, int[] nums2, int m, int n) {
        int replacePointerIndex = m+n-1;
        int pointerOne =m-1;
        int pointerTwo =n-1;
        while (pointerTwo>=0) {
            if(pointerOne>=0 && nums1[pointerOne] > nums2[pointerTwo]) {
                nums1[replacePointerIndex] = nums1[pointerOne];
                pointerOne--;
            } else {
                nums1[replacePointerIndex] = nums2[pointerTwo];
                pointerTwo--;
            }
            replacePointerIndex--;
        }
    }
}

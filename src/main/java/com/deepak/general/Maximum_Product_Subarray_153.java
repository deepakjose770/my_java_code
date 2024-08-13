package com.deepak.general;

public class Maximum_Product_Subarray_153 {
    public int maxProduct(int[] nums) {
        int arraylength = nums.length;
        long leftProduct = 1;
        long rightProduct = 1;
        long max = nums[0];

        for (int i = 0; i<arraylength; i++) {

            leftProduct = (leftProduct==0 || leftProduct < Integer.MIN_VALUE) ? 1: leftProduct;
            rightProduct = (rightProduct==0 || rightProduct < Integer.MIN_VALUE) ? 1: rightProduct;


            leftProduct = leftProduct * nums[i];
            rightProduct = rightProduct * nums[arraylength - 1 - i];

            max= Math.max(max, Math.max(leftProduct, rightProduct));
        }
        return (int)max;
    }

    int maxProduct1(int[] nums) {

        int n = nums.length;
        long leftProduct = 1;
        long rightProduct = 1;
        long ans = nums[0];

        for (int i = 0; i < n; i++) {

            //if any of leftProduct or rightProduct become 0 then update it to 1
            leftProduct = (leftProduct == 0 || leftProduct < Integer.MIN_VALUE) ? 1 : leftProduct;
            rightProduct = (rightProduct == 0 || rightProduct < Integer.MIN_VALUE) ? 1 : rightProduct;

            //prefix product
            leftProduct *= nums[i];

            //suffix product
            rightProduct *= nums[n - 1 - i];

            ans = Math.max(ans, Math.max(leftProduct, rightProduct));
        }

        return (int) ans;
    }
}

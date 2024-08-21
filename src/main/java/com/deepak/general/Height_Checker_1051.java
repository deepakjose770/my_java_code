package com.deepak.general;

import java.util.Arrays;

public class Height_Checker_1051 {
    public int heightChecker(int[] heights) {
        int[] expectedHeights = heights.clone();
        Arrays.sort(expectedHeights);
        int mismatchCount = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expectedHeights[i]) {
                mismatchCount++;
            }
        }
        return mismatchCount;
    }
}

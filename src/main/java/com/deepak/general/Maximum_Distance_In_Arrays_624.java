package com.deepak.general;

import java.util.List;

public class Maximum_Distance_In_Arrays_624 {
    public int maxDistance(List<List<Integer>> arrays) {
        int maxDiff = 0;
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size()-1);
        for (int i = 1; i<arrays.size(); i++) {
            List<Integer> currentArray = arrays.get(i);
            int currentArraySize = currentArray.size();
            int distanceWithMin = Math.abs(currentArray.get(currentArraySize -1) - min);
            int distanceWithMax = Math.abs(currentArray.get(0) - max);
            maxDiff = Math.max(maxDiff, Math.max(distanceWithMax, distanceWithMin));
            min = Math.min(min, currentArray.get(0));
            max = Math.max(max, currentArray.get(currentArraySize-1));

        }
        return maxDiff;
    }
}

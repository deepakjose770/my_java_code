package com.deepak.general;

public class Gas_Station_134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int startIndex = 0;
        int currentGas = 0;

        for (int i = 0; i < gas.length; i++) {
            totalCost = totalCost + cost[i];
            totalGas = totalGas + gas[i];

            currentGas = currentGas + gas[i] - cost[i];

            if (currentGas < 0) {
                startIndex = i + 1;
                currentGas = 0;
            }
        }
        return totalGas >= totalCost ? startIndex : -1;
    }
}

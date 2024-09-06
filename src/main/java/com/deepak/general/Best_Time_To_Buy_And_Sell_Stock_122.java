package com.deepak.general;

public class Best_Time_To_Buy_And_Sell_Stock_122 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Result "+ new Best_Time_To_Buy_And_Sell_Stock_122().maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int totalProfit = 0;
        for (int i = 1; i<prices.length; i++) {
            totalProfit = totalProfit + Math.max(0, prices[i] - prices[i-1]);
        }
        return totalProfit;
    }

}

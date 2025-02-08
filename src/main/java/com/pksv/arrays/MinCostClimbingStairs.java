package com.pksv.arrays;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        System.out.println(new MinCostClimbingStairs().minCostClimbingStairs(cost));
    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] temp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            temp[i] = Math.min(temp[i - 1] + cost[i - 1], temp[i - 2] + cost[i - 2]);
        }
        return temp[n];
    }

    public int minCostClimbingStairs1(int[] cost) {
        int[] dp = new int[cost.length + 1];
        for (int i = 2; i <= cost.length; ++i) {
            dp[i] = Math.min(dp[i - 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);
        }
        return dp[cost.length];
    }
}

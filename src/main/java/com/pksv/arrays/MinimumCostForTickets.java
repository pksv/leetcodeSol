package com.pksv.arrays;

public class MinimumCostForTickets {
    public static void main(String[] args) {
//        int[] days = {4, 6, 7, 8, 20};
//        int[] costs = {2, 7, 15};
        int[] days = {364};
        int[] costs = {3, 3, 1};
        System.out.println(new MinimumCostForTickets().minCostTickets1(days, costs));
    }

    public int minCostTickets(int[] days, int[] costs) {
        int max = days[days.length - 1];
//        int min = days[0];
        boolean[] travel = new boolean[max + 1];
        for (int day : days) {
            travel[day] = true;
        }
        int[] dp = new int[max + 1];
        dp[days[0] - 1] = 0;
        for (int i = days[0]; i <= max; i++) {
            if (!travel[i]) {
                dp[i] = dp[i - 1];
                continue;
            }
            dp[i] = costs[0] + dp[i - 1];
            dp[i] = Math.min(dp[Math.max(0, i - 7)] + costs[1], dp[i]);
            dp[i] = Math.min(dp[Math.max(0, i - 30)] + costs[2], dp[i]);
        }

        return dp[max];
    }

    public int minCostTickets1(int[] days, int[] costs) {
        int max = days[days.length - 1];
        int min = days[0];
        boolean[] travel = new boolean[max - min + 2];
        for (int day : days) {
            travel[day - min + 1] = true;
        }
        int[] dp = new int[max - min + 2];
        dp[0] = 0;
        for (int i = min; i <= max; i++) {
            int x = i + 1 - min;
            if (!travel[x]) {
                dp[x] = dp[x - 1];
                continue;
            }
            dp[x] = costs[0] + dp[x - 1];
            dp[x] = Math.min(dp[Math.max(0, x - 7)] + costs[1], dp[x]);
            dp[x] = Math.min(dp[Math.max(0, x - 30)] + costs[2], dp[x]);
        }

        return dp[max - min + 1];
    }

//    public int minCostTickets(int[] days, int[] costs) {
//        int max = days[days.length - 1];
//        int min = days[0];
//        boolean[] travel = new boolean[max - min + 1];
//        for (int day : days) {
//            travel[day - min] = true;
//        }
//        int[] dp = new int[max - min + 1];
//        int pDay = 0;
//        dp[min - 1] = 0;
//        for (int i = min; i <= max; i++) {
//            int x = i - min;
//            if (!travel[x]) {
//                dp[x] = pDay;
//                continue;
//            }
//            dp[x] = costs[0] + pDay;
//            dp[x] = Math.min(dp[Math.max(0, x - 7)] + costs[1], dp[x]);
//            dp[x] = Math.min(dp[Math.max(0, x - 30)] + costs[2], dp[x]);
//            pDay = dp[x];
//        }
//
//        return dp[max - min];
//    }
}

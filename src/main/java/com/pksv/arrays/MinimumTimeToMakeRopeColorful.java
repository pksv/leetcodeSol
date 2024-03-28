package com.pksv.arrays;

public class MinimumTimeToMakeRopeColorful {
    public static void main(String[] args) {
//        String colors = "abaac";
//        int[] neededTime = {1, 2, 3, 4, 5};
//        String colors = "aabaa";
//        int[] neededTime = {1, 2, 3, 4, 1};
//        String colors = "aaabbbabbbb";
//        int[] neededTime = {3, 5, 10, 7, 5, 3, 5, 5, 4, 8, 1};
        String colors = "abc";
        int[] neededTime = {1, 2, 3};
        System.out.println(new MinimumTimeToMakeRopeColorful().minCost(colors, neededTime));
    }

    public int minCost(String colors, int[] neededTime) {
        int time = 0;
        var c = colors.toCharArray();
        for (int i = 0; i < neededTime.length - 1; i++) {
            if (c[i] == c[i + 1]) {
                time = time + Math.min(neededTime[i], neededTime[i + 1]);
                neededTime[i + 1] = Math.max(neededTime[i], neededTime[i + 1]);
            }
        }
        return time;
    }
}

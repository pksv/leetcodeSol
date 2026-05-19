package com.pksv.arrays;

import java.util.Arrays;

public class MaximumJumpsToLastIndex {
    public static void main(String[] args) {
//        int[] nums = {1, 3, 6, 4, 1, 2};
//        int[] nums = {0, 2, 1, 3};
        int[] nums = {0, 2, 1, 3, 4};
//        int[] nums = {1, 0, 2};
        int target = 1;
        System.out.println(new MaximumJumpsToLastIndex().maximumJumps1(nums, target));
    }

    public int maximumJumps(int[] nums, int target) {
        int lastAcceptedIndex = 0;
        int jumps = 0;
        for (int i = 1; i < nums.length; i++) {
            int x = nums[i] - nums[lastAcceptedIndex];
            if (x >= -target && x <= target) {
                lastAcceptedIndex = i;
                jumps++;
            }
        }

        return lastAcceptedIndex == nums.length - 1 ? jumps : -1;
    }

    public int maximumJumps1(int[] nums, int target) {
        int len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[0] = 1;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (Math.abs(nums[i] - nums[j]) <= target) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        return dp[len - 1] <= 0 ? -1 : dp[len - 1];
    }
}

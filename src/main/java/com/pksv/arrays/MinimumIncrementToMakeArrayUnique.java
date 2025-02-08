package com.pksv.arrays;

import java.util.Arrays;

public class MinimumIncrementToMakeArrayUnique {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 2, 1, 7};
        System.out.println(new MinimumIncrementToMakeArrayUnique().minIncrementForUnique(nums));
    }

    public int minIncrementForUnique(int[] nums) {
        int moves = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i + 1]) {
                moves += (nums[i - 1] - nums[i] + 1);
                nums[i] = nums[i - 1] + 1;
            }
        }
        return moves;
    }

    private void temp(int[] nums) {
        int moves = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                while (nums[i] == nums[j]) {
                    nums[j]++;
                    moves++;
                }
            }
        }
    }
}

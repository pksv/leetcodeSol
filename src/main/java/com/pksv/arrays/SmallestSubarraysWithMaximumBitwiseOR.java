package com.pksv.arrays;

import java.util.Arrays;

public class SmallestSubarraysWithMaximumBitwiseOR {
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 1, 3};
        System.out.println(Arrays.toString(new SmallestSubarraysWithMaximumBitwiseOR().smallestSubarrays(nums)));
    }

    public int[] smallestSubarrays(int[] nums) {
        int d = nums[0];
        for (int i = 1; i < nums.length; i++) {
            d = d | nums[i];
            System.out.println(d + " " + nums[i]);
        }

        return null;
    }
}

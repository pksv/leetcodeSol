package com.pksv.arrays;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
//        int[] nums = {0, 1, 0, 3, 12};
        int[] nums = {0, 0, 1};
        new MoveZeroes().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[c++] = nums[i];
            }
        }
        while (c < nums.length) {
            nums[c++] = 0;
        }
    }
}
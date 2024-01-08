package com.pksv.arrays;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println(new RemoveElement().removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }

    public int removeElement(int[] nums, int val) {
        int c = 0;
        for (int num : nums) {
            if (num != val) {
                nums[c++] = num;
            }
        }
        return c;
    }
}

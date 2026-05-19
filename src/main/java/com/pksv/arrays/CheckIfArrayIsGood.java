package com.pksv.arrays;

import java.util.Arrays;

public class CheckIfArrayIsGood {
    public static void main(String[] args) {
//        int[] nums = {2, 1, 3};
        int[] nums = {1, 3, 3, 2};
//        int[] nums = {3, 4, 4, 1, 2, 1};
//        int[] nums = {2, 4, 4, 4};
        System.out.println(new CheckIfArrayIsGood().isGood(nums));
    }

    public boolean isGood1(int[] nums) {
        int len = nums.length - 1;
        if (len < 1) return false;
        Arrays.sort(nums);
        for (int i = 1; i < len; i++) {
            if (nums[i - 1] != i) return false;
        }
        if (nums[len] != nums[len - 1]) return false;
        return nums[len] == len;
    }

    public boolean isGood(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }
        if(nums.length != max + 1) return false;
        int[] freq = new int[max + 1];
        for (int num : nums) {
            freq[num]++;
        }
        for (int i = 1; i < max; i++) {
            if(freq[i] != 1) return false;
        }
        return freq[max] == 2;
    }
}

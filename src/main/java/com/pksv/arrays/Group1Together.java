package com.pksv;

import java.util.Arrays;

//Minimum Swaps to Group All 1's Together II
public class Group1Together {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 1, 1, 0, 0};
        System.out.println(new Group1Together().minSwaps(nums));
    }

    public int minSwaps(int[] nums) {
        int n = nums.length;
        int s = Arrays.stream(nums).sum();
        int count = 0;
        for (int i = 0; i < s; i++) {
            count += nums[i];
        }
        int max = count;
        for (int i = s; i < n + s; i++) {
            count += nums[i % n] - nums[(i - s + n) % n];
            max = Math.max(max, count);
        }
        return s - max;
    }
}

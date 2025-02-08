package com.pksv.arrays;

public class MaximumWidthRamp {
    public static void main(String[] args) {
        int[] nums = {6, 0, 8, 2, 1, 5};
        System.out.println(new MaximumWidthRamp().maxWidthRamp(nums));
    }

    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int[] max = new int[n];
        max[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            max[i] = Math.max(max[i + 1], nums[i]);
        }

        int l = 0, r = 0;
        int maxWidth = 0;
        while (r < n) {
            while (l < r && nums[l] > max[r]) {
                l++;
            }
            maxWidth = Math.max(maxWidth, r - l);
            r++;
        }
        return maxWidth;
    }
}

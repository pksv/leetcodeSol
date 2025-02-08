package com.pksv;

public class SumOfAllSubsetXORTotals {
    public static void main(String[] args) {
//        int[] nums = {1, 3};
        int[] nums = {5, 1, 6};
        System.out.println(new SumOfAllSubsetXORTotals().subsetXORSum(nums));
    }

    public int subsetXORSum1(int[] nums) {
        int s = 0;
        for (int num : nums) {
            s |= num;
        }
        return s << (nums.length - 1);
    }

    public int subsetXORSum(int[] nums) {
        return temp(nums, 0, 0);
    }

    private int temp(int[] nums, int i, int c) {
        if (i == nums.length) return c;
        return temp(nums, i + 1, c) + temp(nums, i + 1, c ^ nums[i]);
    }
}

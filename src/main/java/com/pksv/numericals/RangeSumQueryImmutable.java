package com.pksv.numericals;

public class RangeSumQueryImmutable {
    public static void main(String[] args) {
        NumArray array = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(array.sumRange(0, 2));
        System.out.println(array.sumRange(2, 5));
        System.out.println(array.sumRange(0, 5));
    }
}

class NumArray {

    private final int[] n;

    public NumArray(int[] nums) {
        n = new int[nums.length];
        n[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            n[i] = n[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return n[right] - ((left == 0) ? 0 : n[left - 1]);
    }
}
package com.pksv.arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 0};
//        int[] nums = {3, 4, -1, 1};
        int[] nums = {7, 8, 9, 11, 12};
        System.out.println(new FirstMissingPositive().firstMissingPositive(nums));
    }

    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] temp = new boolean[n + 1];
        for (int num : nums) {
            if (num > 0 && num <= n) {
                temp[num] = true;
            }
        }
        for (int i = 1; i < temp.length; i++) {
            if (!temp[i]) return i;
        }
        return n + 1;
    }
}

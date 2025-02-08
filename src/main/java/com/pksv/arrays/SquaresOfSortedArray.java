package com.pksv;

public class SquaresOfSortedArray {
    public static void main(String[] args) {

    }

    public int[] sortedSquares(int[] nums) {
        int[] sol = new int[nums.length];
        int l = 0, r = nums.length - 1, i = nums.length;

        while (l < r) {
            if (Math.abs(nums[r]) > Math.abs(nums[l])) {
                sol[--i] = nums[r] * nums[r--];
            } else
                sol[--i] = nums[l] * nums[l++];
        }
        return sol;
    }
}

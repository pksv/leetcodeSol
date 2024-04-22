package com.pksv.arrays;

public class MinMaxGame {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2, 4, 8, 2, 2};
        System.out.println(new MinMaxGame().minMaxGame(nums));
    }

    public int minMaxGame(int[] nums) {
        if(nums.length == 1) return nums[0];
        int[] newNums = new int[nums.length / 2];
        int x = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (x % 2 == 0) {
                newNums[x++] = Math.min(nums[i], nums[i + 1]);
            } else {
                newNums[x++] = Math.max(nums[i], nums[i + 1]);
            }
        }

        return minMaxGame(newNums);
    }
}

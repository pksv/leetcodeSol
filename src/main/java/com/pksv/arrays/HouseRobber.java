package com.pksv.arrays;

public class HouseRobber {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 1};
//        int[] nums = {2, 1, 1, 2};
        int[] nums = {1, 2, 2, 1};

//        int[] nums = {2, 7, 9, 3, 1};
        System.out.println(new HouseRobber().rob(nums));
    }

    public int rob(int[] nums) {
        int rob = 0;
        int noRob = 0;
        for (int num : nums) {
            int newRob = noRob + num;
            int nnRob = Math.max(rob, noRob);
            rob = newRob;
            noRob = nnRob;
        }

        return Math.max(rob, noRob);
    }
}

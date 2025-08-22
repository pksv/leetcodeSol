package com.pksv.arrays;

public class ZeroFilledSubarray {
    public static void main(String[] args) {
//        int[] nums = {1, 3, 0, 0, 2, 0, 0, 4};
//        int[] nums = {0, 0, 0, 2, 0, 0};
        int[] nums = {2,10,2019};
        System.out.println(new ZeroFilledSubarray().zeroFilledSubarray(nums));
    }

    public long zeroFilledSubarray(int[] nums) {
        long subArrCount = 0;
        long currZeros = 0;
        for (int num : nums) {
            if (num == 0) {
                subArrCount += ++currZeros;
            } else currZeros = 0;
        }

        return subArrCount;
    }
}

package com.pksv.arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
//        int[] nums = {3, 2, 1};
//        int[] nums = {2, 2, 3, 1};
        int[] nums = {1, 1, 2};
        System.out.println(new ThirdMaximumNumber().thirdMax(nums));
    }

    public int thirdMax(int[] nums) {
        long l1 = Long.MIN_VALUE, l2 = Long.MIN_VALUE, l3 = Long.MIN_VALUE;
        for (int i : nums) {
            if (i == l1 || i == l2 || i == l3) continue;
            if (i > l1) {
                l3 = l2;
                l2 = l1;
                l1 = i;
                continue;
            }
            if (i > l2) {
                l3 = l2;
                l2 = i;
                continue;
            }
            if (i > l3) l3 = i;
        }
        if (l3 == Long.MIN_VALUE) return (int) l1;

        return (int) l3;
    }
}

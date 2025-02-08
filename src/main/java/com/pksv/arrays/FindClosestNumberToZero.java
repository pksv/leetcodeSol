package com.pksv;

public class FindClosestNumberToZero {
    public static void main(String[] args) {
        int[] nums = {-4, -2, 1, 4, 8};
        System.out.println(new FindClosestNumberToZero().findClosestNumber(nums));
    }

    public int findClosestNumber(int[] nums) {
        int closestValue = nums[0];
        for (var n : nums) {
            int d1 = Math.abs(n);
            int d2 = Math.abs(closestValue);
            if (d1 < d2) closestValue = n;
            else if (d1 == d2 && n > closestValue) closestValue = n;
        }
        return closestValue;
    }
}

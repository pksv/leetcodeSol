package com.pksv.arrays;

public class SpecialArrayWithXElements {
    public static void main(String[] args) {
        int[] nums = {1, 3, 9, 5, 11, 2, 11, 0, 4, 2};
        System.out.println(new SpecialArrayWithXElements().specialArray(nums));
    }

    public int specialArray(int[] nums) {
        int n = nums.length;
        while (n > 0) {
            int count = 0;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] < n) {
                    if (count > n)
                        break;
                } else
                    count++;
            }
            if (count == n) {
                return n;
            }
            n--;
        }
        return -1;
    }
}

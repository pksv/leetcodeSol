package com.pksv;

import java.util.Arrays;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1}, nums2 = {2, 2};
        System.out.println(Arrays.toString(new IntersectionOfTwoArraysII().intersect(nums1, nums2)));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        int[] counter = new int[1001];
        int[] result = new int[1001];
        for (int num : nums1) {
            counter[num]++;
        }
        int i = 0;
        for (int num : nums2) {
            if (counter[num] > 0) {
                counter[num]--;
                result[i++] = num;
            }
        }
        return Arrays.copyOfRange(result, 0, i);
    }
}

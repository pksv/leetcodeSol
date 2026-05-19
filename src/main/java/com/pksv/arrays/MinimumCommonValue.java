package com.pksv.arrays;

import java.util.HashSet;
import java.util.Set;

public class MinimumCommonValue {
    public static void main(String[] args) {
//        int[] nums1 = {1, 2, 3};
//        int[] nums2 = {2, 4};
        int[] nums1 = {1, 6, 7, 10};
        int[] nums2 = {2, 3, 4, 5};
        System.out.println(new MinimumCommonValue().getCommon(nums1, nums2));
    }

    public int getCommon1(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int j : nums1) {
            set.add(j);
        }
        int min = Integer.MAX_VALUE;
        for (int j : nums2) {
            if (set.contains(j)) {
                min = Math.min(min, j);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        if (nums1[len1 - 1] > nums2[i] && nums1[i] > nums2[len2 - 1]) {
            return -1;
        }
        while (i < len1 && j < len2) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            }
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            }
        }
        return -1;
    }
}

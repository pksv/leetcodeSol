package com.pksv.arrays;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0}, nums2 = {2, 5, 6};
        int m = 3, n = 3;
        new MergeSortedArray().merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] clone = nums1.clone();
        int i = 0, j = 0, pos = 0;
        while (i < m && j < n) {
            if (clone[i] <= nums2[j]) {
                nums1[pos++] = clone[i++];
            }
            if (nums2[j] < clone[i]) {
                nums1[pos++] = nums2[j++];
            }
        }
        while (i < m)
            nums1[pos++] = clone[i++];
        while (j < n)
            nums1[pos++] = nums2[j++];
    }
}

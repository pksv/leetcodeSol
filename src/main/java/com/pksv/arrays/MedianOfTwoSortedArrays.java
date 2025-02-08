package com.pksv;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4};
        System.out.println(new MedianOfTwoSortedArrays().findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        double median = 0d, prev = 0d;
        int i = 0, j = 0;
        int mid = (m + n) / 2;

        while ((i + j) < mid + 1) {
            prev = median;
            if (i < m && j < n) {
                if (nums1[i] < nums2[j]) {
                    median = nums1[i];
                    i++;
                } else if (nums1[i] > nums2[j]) {
                    median = nums2[j];
                    j++;
                } else {
                    median = nums1[i];
                    i++;
                }
            } else if (i >= m) {
                median = nums2[j];
                j++;
            } else {
                median = nums1[i];
                i++;
            }
        }

        return (m + n) % 2 == 0 ? (prev + median) / 2 : median;
    }

    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums3 = new int[m + n];
        System.arraycopy(nums1, 0, nums3, 0, m);
        System.arraycopy(nums2, 0, nums3, m, n);
        Arrays.sort(nums3);
        int len = nums3.length / 2;
        if ((m + n) % 2 == 0) {
            return (double) (nums3[len] + nums3[len - 1]) / 2;
        }
        return nums3[len];
    }
}

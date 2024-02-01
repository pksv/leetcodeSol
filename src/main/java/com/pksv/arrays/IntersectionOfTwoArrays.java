package com.pksv.arrays;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1}, nums2 = {2, 2};
//        int[] nums1 = {4, 9, 5}, nums2 = {9, 4, 9, 8, 4};
//        int[] nums1 = {3, 1, 2}, nums2 = {1};
        System.out.println(Arrays.toString(new IntersectionOfTwoArrays().intersect(nums1, nums2)));

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> num1 = new HashSet<>();
        for (var num : nums1) {
            num1.add(num);
        }
        for (var num : nums2) {
            if (num1.contains(num) && !result.contains(num)) {
                result.add(num);
            }
        }
        int[] sol = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            sol[i] = result.get(i);
        }
        return sol;
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        List<Integer> num1 = new ArrayList<>();
        for (var num : nums1) {
            num1.add(num);
        }
        for (var num : nums2) {
            if (num1.contains(num)) {
                num1.remove((Integer) num);
                result.add(num);
            }
        }
        int[] sol = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            sol[i] = result.get(i);
        }
        return sol;
    }
}

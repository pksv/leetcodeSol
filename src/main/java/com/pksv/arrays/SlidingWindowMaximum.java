package com.pksv.arrays;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindowMaximum {
    public static void main(String[] args) {

    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length - k + 1; i++) {
            int x = Integer.MIN_VALUE;

            for (int j = i; j < i + k; j++) {
                x = Math.max(x, nums[j]);
            }
            res.add(x);
        }
        int[] x = new int[res.size()];
        for (int i = 0; i < x.length; i++) {
            x[i] = res.get(i);
        }
        return x;
    }

    public int[] maxSlidingWindow1(int[] nums, int k) {
//        Deque<Integer> temp = new ArrayDeque<>();
//        for (int i = 0; i < k; i++) {
//            temp.add(nums[i]);
//        }
//        for (int i = k - 1; i < nums.length; i++) {
//
//        }

        return new int[10];
    }
}

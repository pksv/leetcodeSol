package com.pksv.arrays;

import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
//        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
//        int[] nums = {1, 3, 1, 2, 0, 5};
//        int k = 3;
//        int[] nums = {1, -9, 8, -6, 6, 4, 0, 5};
//        int[] nums = {-7, -8, 7, 5, 7, 1, 6, 0};
//        int k = 4;
//        int[] nums = {1, -1};
//        int k = 1;
        int[] nums;
        try {
            nums = new ArrayLongInput().getInput();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int k = 10007;
        System.out.println(Arrays.toString(new SlidingWindowMaximum().maxSlidingWindow(nums, k)));
    }

    //incomplete
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int x = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offer(i);
            if (i >= k - 1) {
                result[x++] = nums[deque.peek()];
            }
        }
        return result;
    }

    public int[] maxSlidingWindow1(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        int x = 0;
        int max = nums[0];
        int start = 0;
        int end = k - 1;
        while (end < nums.length) {
            if (start != 0 && nums[end] > max) {
                max = nums[end];
            } else {
                max = nums[start];
                for (int i = start + 1; i <= end; i++) {
                    max = Math.max(max, nums[i]);
                }
            }
            if (end - start + 1 == k) {
                start++;
            }
            while (start < end && nums[end] > nums[start]) {
                start++;
            }
            res[x++] = max;
            end++;
        }
        return res;
    }
}
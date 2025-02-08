package com.pksv.arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
//        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums = {5, 4, -1, 7, 8};
//        int[] nums = {-2, 1};
        System.out.println(new MaximumSubarray().maxSubArray2(nums));
    }

    public int maxSubArray(int[] nums) {
        int temp = 0;
        int max = 0;
        for (int num : nums) {
            temp += num;
            max = Math.max(max, temp);
            temp = Math.max(temp, 0);
        }
        return max;
    }

    public int maxSubArray2(int[] nums) {
        return maxSubArray(nums, 0, nums.length - 1);
    }

    public int maxSubArray(int[] nums, int start, int end) {
        if (start > end) return Integer.MIN_VALUE;
        if (start == end) return nums[start];
        int mid = (start + end) / 2;
        int left = maxSubArray(nums, start, mid - 1);
        int right = maxSubArray(nums, mid + 1, end);
        int cross = maxSub(nums, start, mid, end);
        System.out.println("m1 --> left = " + left + ", right = " + right + ", cross = " + cross);
        return Math.max(cross, Math.max(left, right));
    }

    public int maxSub(int[] nums, int start, int mid, int end) {
        int left = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= start; i--) {
            sum += nums[i];
            left = Math.max(left, sum);
        }
        int right = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid; i <= end; i++) {
            sum += nums[i];
            right = Math.max(right, sum);
        }

        int cross = left + right - nums[mid];
        System.out.println("m2 --> left = " + left + ", right = " + right + ", cross = " + cross);
        return Math.max(cross, Math.max(left, right));
    }
}
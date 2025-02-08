package com.pksv;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
//        int[] nums = {1, 12, -5, -6, 50, 3};
//        int k = 4;
        int[] nums = {5};
        int k = 1;
        System.out.println(new MaximumAverageSubarrayI().findMaxAverage(nums, k));
    }

    public double findMaxAverage(int[] nums, int k) {
        double max = Double.NEGATIVE_INFINITY;
        double sum = 0;
        int i = 0, j = 0;
        while (j < nums.length) {
            sum += nums[j];
            if (j - i + 1 == k) {
                max = Math.max(max, sum);
                sum -= nums[i++];
            }
            j++;

        }
        return max / k;
    }
}

package com.pksv.others_or_repeated;

public class MaxSum {
    public static void main(String[] args) {

    }

    private int maxSum(int[][] arr) {
        int negatives = 0;
        int smallest = arr[0][0];
        int sum = 0;
        for (int[] nums : arr) {
            for (int num : nums) {
                int ab = Math.abs(num);
                if (num < 0) negatives++;
                smallest = Math.min(smallest, ab);
                sum += ab;
            }
        }
        return negatives % 2 == 0 ? sum : sum - smallest;
    }
}

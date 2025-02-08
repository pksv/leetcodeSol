package com.pksv.arrays;

import java.util.Arrays;

//Two Sum II - Input Array Is Sorted
public class TwoSumII {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
//        int[] numbers = {2, 3, 4};
        int target = 9;
        System.out.println(Arrays.toString(new TwoSumII().twoSum(numbers, target)));
    }

    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                return new int[]{l + 1, r + 1};
            }
            if (sum > target) r--;
            else l++;
        }
        return null;
    }
}

package org.example;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
//        int[] nums = {4, 1, 2, 1, 2};
        int[] nums = {2, 2, 1};
//        int[] nums = {1};
        System.out.println(new SingleNumber().singleNumberXOR(nums));
    }

    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                if (i == 0) {
                    return nums[i];
                }
                if (nums[i - 1] != nums[i]) {
                    return nums[i];
                }
            }
        }

        return nums[nums.length - 1];
    }

    public int singleNumberXOR(int[] nums) {
        var targetNumber = 0;
        for (var num : nums) {
            targetNumber ^= num;
            System.out.println(targetNumber);
        }
        return targetNumber;
    }
}
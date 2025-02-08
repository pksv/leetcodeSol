package com.pksv.arrays;

import java.util.HashMap;
import java.util.Map;

public class CountSpecialQuadruplets {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 5};
        System.out.println(new CountSpecialQuadruplets().countQuadruplets(nums));
    }

    public int countQuadruplets(int[] nums) {
        Map<Integer, Integer> diff = new HashMap<>();
        int count = 0;
        for (int i = nums.length - 2; i >= 1; i--) {
            for (int j = i - 1; j >= 0; j--) {
                count += diff.getOrDefault(nums[i] + nums[j], 0);
            }
            for (int j = nums.length - 1; j > i; j--) {
                diff.put(nums[j] - nums[i], diff.getOrDefault(nums[j] - nums[i], 0) + 1);
            }
        }

        return count;
    }
}

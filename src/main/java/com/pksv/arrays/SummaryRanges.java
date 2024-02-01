package com.pksv.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 7};
        System.out.println(Arrays.toString(new SummaryRanges().summaryRanges(nums).toArray()));
    }

    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        List<String> sol = new ArrayList<>();
        int a = nums[0];
        for (int i = 1; i < nums.length; i++) {
            while (i < nums.length - 1 && nums[i - 1] + 1 == nums[i]) {
                i++;
            }
            if (nums[i - 1] + 1 != nums[i]) {
                sol.add(getString(nums[i - 1], a));
                a = nums[i];
            }
        }
        sol.add(getString(nums[nums.length - 1], a));
        return sol;
    }

    private String getString(int nums, int a) {
        if (a == nums) return String.valueOf(a);
        else return a + "->" + nums;
    }
}

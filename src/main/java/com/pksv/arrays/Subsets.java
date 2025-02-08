package com.pksv.arrays;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        var s = new Subsets().subsets(nums);
        for (int i = 0; i < s.size(); i++) {
            for (List<Integer> integers : s) {
                if (integers.size() == i) {
                    System.out.println(integers);
                }
            }
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        createSubsets(nums, 0, result, subset);
        return result;
    }

    private void createSubsets(int[] nums, int i, List<List<Integer>> result, List<Integer> subset) {
        if (i == nums.length) {
            result.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        createSubsets(nums, i + 1, result, subset);

        subset.removeLast();
        createSubsets(nums, i + 1, result, subset);
    }
}

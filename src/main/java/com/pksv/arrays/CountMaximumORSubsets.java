package com.pksv;

//Count Number of Maximum Bitwise-OR Subsets
public class CountMaximumORSubsets {
    public static void main(String[] args) {
//        int[] nums = {3, 1};
//        int[] nums = {2, 2, 2};
        int[] nums = {3, 2, 1, 5};
        System.out.println(new CountMaximumORSubsets().countMaxOrSubsets(nums));
    }

    public int countMaxOrSubsets(int[] nums) {
        int totalOr = 0;
        for (var n : nums) {
            totalOr |= n;
        }
        return countOfSubsets(nums, 0, 0, totalOr);
    }

    private int countOfSubsets(int[] nums, int i, int curr, int target) {
        if (i == nums.length) {
            if (curr == target)
                return 1;
            else return 0;
        }
        int inc = countOfSubsets(nums, i + 1, curr, target);
        int exc = countOfSubsets(nums, i + 1, curr | nums[i], target);
        return inc + exc;
    }
}

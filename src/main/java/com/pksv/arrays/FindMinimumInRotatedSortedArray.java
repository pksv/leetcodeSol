package com.pksv.arrays;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
//        int[] nums = {3, 4, 5, 1, 2};
//        int[] nums = {6, 7, 0, 1, 2, 4, 5};
//        int[] nums = {11, 13, 15, 17};
        int[] nums = {11, 13};

        System.out.println(new FindMinimumInRotatedSortedArray().findMin(nums));
    }

    public int findMin(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.min(nums[0], nums[1]);
        int min = Integer.MAX_VALUE;
        int i = 0, j = nums.length - 1;
        while (i < j && (j != i + 1)) {
            if (nums[(i + j) / 2] > nums[j]) {
                i = (i + j) / 2;
                min = Math.min(min, nums[j]);
                continue;
            }
            j = (i + j) / 2;
            min = Math.min(min, Math.min(nums[j], nums[i]));
        }
        return min;
    }
}

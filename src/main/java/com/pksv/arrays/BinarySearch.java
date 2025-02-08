package com.pksv;

public class BinarySearch {
    public static void main(String[] args) {
//        int[] nums = {-1, 0, 3, 5, 9, 12};
        int[] nums = {5};

        int target = 5;
        System.out.println(new BinarySearch().search(nums, target));
    }

    public int search(int[] nums, int target) {
        int end = nums.length - 1;
        int start = 0;
        while (end >= start) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                end = mid - 1;
            } else start = mid + 1;
        }
        return -1;
    }
}

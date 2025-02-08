package com.pksv;

import java.util.Arrays;

// Product of Array Except Self
public class ProductOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(new ProductOfArray().productExceptSelf(nums)));
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] product = new int[n];
        int temp = 1;
        for (int i = 0; i < n; i++) {
            product[i] = temp;
            temp *= nums[i];
        }
        temp = 1;
        for (int i = n - 1; i >= 0; i--) {
            product[i] *= temp;
            temp *= nums[i];
        }
        return product;
    }
}

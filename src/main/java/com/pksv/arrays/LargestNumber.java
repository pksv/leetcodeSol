package com.pksv.arrays;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
//        int[] nums = {10, 2};
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println(new LargestNumber().largestNumber(nums));
    }

    public String largestNumber(int[] nums) {
        StringBuilder b = new StringBuilder();
        String[] temp = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(temp, (i, j) -> ((j + i).compareTo(i + j)));
        if (temp[0].equals("0")) return "0";
        for (var t : temp)
            b.append(t);

        return b.toString();
    }
}

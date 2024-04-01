package com.pksv.arrays;

import java.io.FileNotFoundException;

public class MissingNumber {
    public static void main(String[] args) {
//        int[] nums = {3, 0, 1};
        var x = new MissingNumber();
        ArrayLongInput input = new ArrayLongInput();
        int[] nums;
        try {
            nums = input.getObstacles();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        var z = x.missingNumber(nums);
        System.out.println("result = " + z);
    }

    public int missingNumber(int[] nums) {
        int sum = 0, as = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += i;
            as += nums[i];
        }
        return sum - as;
    }
}

package com.pksv.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparateDigitsInArray {
    public static void main(String[] args) {
        int[] nums = {13, 25, 83, 77};
        System.out.println(Arrays.toString(new SeparateDigitsInArray().separateDigits1(nums)));
    }

    public int[] separateDigits(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int num : nums) {
            var x = String.valueOf(num).split("");
            list.addAll(List.of(x));
        }
        return list.stream().mapToInt(Integer::parseInt).toArray();
    }

    public int[] separateDigits1(int[] nums) {
        int totalLength = 0;
        for (int num : nums) {
            totalLength += String.valueOf(num).length();
        }
        int[] res = new int[totalLength];
        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            if (num == 0) {
                res[--totalLength] = 0;
            } else {
                while (num > 0) {
                    res[--totalLength] = num % 10;
                    num /= 10;
                }
            }
        }
        return res;
    }
}

package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSums {

    public static void main(String[] args) {
/*
        int[] input = {2, 7, 11, 15};
        int target = 9;
*/
/*
        int[] input = {3, 2, 4};
        int target = 6;
*/
        int[] input = {3, 3};
        int target = 6;
        System.out.println(Arrays.toString(new TwoSums().twoSum(input, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 1};
    }


    public int ArrayPairSum(int[] nums, int target) {
        List<Integer> numList = new ArrayList<>();
        List<Integer[]> result = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
            if (numList.contains(target - num)) {
                var x = new Integer[]{num, target - num};
                if (!result.contains(x)) {
                    result.add(x);
                }
            }
        }
        return result.size();
    }
}

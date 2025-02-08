package com.pksv.arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class SortArrayIncreasingFrequency {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3};
        System.out.println(Arrays.toString(new SortArrayIncreasingFrequency().frequencySort(nums)));
    }

    public int[] frequencySort(int[] nums) {
        Integer[] sol = new Integer[nums.length];
        Map<Integer, Integer> counter = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            counter.put(nums[i], counter.getOrDefault(nums[i], 0) + 1);
            sol[i] = nums[i];
        }

        Arrays.sort(sol, (n1, n2) -> {
            if (counter.get(n1) == counter.get(n2)) {
                return n2 - n1;
            } else return counter.get(n1) - counter.get(n2);
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sol[i];
        }
        return nums;
    }
}

package com.pksv.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(new FindAllDuplicatesArray().findDuplicates(nums));
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int[] temp = new int[nums.length + 1];
        for (int x : nums) {
            temp[x]++;
            if (temp[x] == 2) res.add(x);
        }
        return res;
    }
}

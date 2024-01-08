package com.pksv.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(new ContainsDuplicate().containsDuplicate(nums));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> temp = new HashSet<>();
        for (var num : nums) {
            if (temp.contains(num)) return true;
            temp.add(num);
        }
        return false;
    }
}

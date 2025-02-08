package com.pksv.others_or_repeated;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> temp = new HashSet<>();
        for (var num : nums) {
            if (!temp.add(num)) return true;
        }
        return false;
    }
}

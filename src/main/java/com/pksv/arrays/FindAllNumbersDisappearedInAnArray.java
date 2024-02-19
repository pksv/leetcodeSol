package com.pksv.arrays;

import java.util.*;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
//        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] nums = {1, 1};
        System.out.println(Arrays.toString(new FindAllNumbersDisappearedInAnArray().findDisappearedNumbers(nums).toArray()));
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
//        Set<Integer> s = new HashSet<>();
//        for (int i : nums) {
//            s.add(i);
//        }
//        List<Integer> sol = new ArrayList<>();
//        for (int i = 1; i <= nums.length; i++) {
//            if (!s.contains(i)) sol.add(i);
//        }

        boolean[] x = new boolean[nums.length + 1];
        for (int i : nums) {
            x[i] = true;
        }
        List<Integer> sol = new ArrayList<>();
        for (int i = 1; i < x.length; i++) {
            if (!x[i]) sol.add(i);
        }
        return sol;
    }
}

package com.pksv.arrays;

import java.util.*;

public class SortJumbledNumbers {
    public static void main(String[] args) {
        int[] mapping = {8, 9, 4, 0, 2, 1, 3, 5, 7, 6}, nums = {991, 338, 38};
        System.out.println(Arrays.toString(new SortJumbledNumbers().sortJumbled(mapping, nums)));
    }

    public int[] sortJumbled(int[] mapping, int[] nums) {
        Map<Integer, List<Integer>> map = new TreeMap<>();

        for (int num : nums) {
            char[] c = String.valueOf(num).toCharArray();
            for (int i = 0; i < c.length; i++) {
                c[i] = (char) ('0' + mapping[c[i] - '0']);
            }
            int t = Integer.parseInt(new String(c));
            var x = map.getOrDefault(t, new ArrayList<>());
            x.add(num);
            map.put(t, x);
        }
        int i = 0;
        for (var m : map.keySet()) {
            for (var t : map.get(m)) {
                nums[i++] = t;
            }
        }

        return nums;
    }
}

package com.pksv.hashmaps;

import java.util.*;

public class ClosestEqualElementQueries {
    public static void main(String[] args) {
        int[] nums = {1, 3, 1, 4, 1, 3, 2};
        int[] queries = {0, 3, 5};
//        int[] nums = {1, 2, 3, 4};
//        int[] queries = {0, 1, 2, 3};
        System.out.println(new ClosestEqualElementQueries().solveQueries(nums, queries));
    }

    public List<Integer> solveQueries(int[] nums, int[] queries) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        for (int query : queries) {
            var list = map.get(nums[query]);
            var size = list.size();
            if (list.isEmpty() || size == 1) {
                res.add(-1);
                continue;
            }
            if (size == 2) {
                int diff = Math.abs(list.getFirst() - list.getLast());
                res.add(Math.min(diff, len - diff));
                continue;
            }
            int index = Collections.binarySearch(list, query);
            int a = Math.abs(list.get((index - 1 + size) % size) - query);
            int b = Math.abs(list.get((index + 1) % size) - query);
            res.add(Math.min(Math.min(a, b), Math.min(len - a, len - b)));
        }

        return res;
    }
}

package com.pksv.arrays;

import java.util.List;

public class MaximumDistanceArrays {
    public static void main(String[] args) {
//        List<List<Integer>> arrays = List.of(
//                List.of(1, 2, 3),
//                List.of(4, 5),
//                List.of(1, 2, 3)
//        );
        List<List<Integer>> arrays = List.of(
                List.of(1, 4, 5),
                List.of(0, 2)
        );
        System.out.println(new MaximumDistanceArrays().maxDistance(arrays));
    }

    public int maxDistance(List<List<Integer>> arrays) {
        int first = arrays.getFirst().getFirst();
        int last = arrays.getFirst().getLast();
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arrays.size(); i++) {
            max = Math.max(max, Math.abs(arrays.get(i).getLast() - first));
            max = Math.max(max, Math.abs(arrays.get(i).getFirst() - last));
            first = Math.min(arrays.get(i).getFirst(), first);
            last = Math.max(arrays.get(i).getLast(), last);
        }
        return max;
    }
}

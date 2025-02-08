package com.pksv;

import java.util.PriorityQueue;

//Maximal Score After Applying K Operations
public class MaximalScore {
    public static void main(String[] args) {
        int[] nums = {10, 10, 10, 10, 10};
        int k = 5;
        System.out.println(new MaximalScore().maxKElements(nums, k));
    }

    public long maxKElements(int[] nums, int k) {
        long score = 0L;
        PriorityQueue<Integer> elements = new PriorityQueue<>((a, b) -> b - a);
        for (var n : nums) {
            elements.add(n);
        }
        while (k-- > 0) {
            Integer x = elements.poll();
            score += x;
            elements.add((int) Math.ceil(x / 3.0));
        }

        return score;
    }
}

package com.pksv.arrays;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

//Minimum Operations to Exceed Threshold Value II
public class MinimumOperations {
    public static void main(String[] args) {

    }

    public int minOperations(int[] nums, int k) {
        if (nums.length < 2) return 0;
        PriorityQueue<Long> minHeap = new PriorityQueue<>(
                Arrays.stream(nums)
                        .mapToLong(i -> (long) i)
                        .boxed()
                        .collect(Collectors.toList())
        );
        int count = 0;
        while (minHeap.peek() < k) {
            long x = minHeap.remove();
            long y = minHeap.remove();
            minHeap.offer(Math.min(x, y) * 2 + Math.max(x, y));
            count++;
        }

        return count;
    }
}

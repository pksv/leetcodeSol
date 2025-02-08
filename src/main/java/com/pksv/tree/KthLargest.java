package com.pksv.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class KthLargest {
    List<Integer> num;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        num = Arrays.stream(nums)
                .boxed()
                .sorted(Comparator.reverseOrder()).limit(k)
                .collect(Collectors.toCollection(ArrayList::new));
//        if (!num.isEmpty() && num.size() > k)
//            num = num.subList(0, k);
    }

    public static void main(String[] args) {
//        int k = 3;
//        int[] nums = {4, 5, 8, 2};
        int k = 1;
        int[] nums = {};
//        int k = 3;
//        int[] nums = {5, -1};
        KthLargest kthLargest = new KthLargest(k, nums);
        System.out.println(kthLargest.add(-3));
        System.out.println(kthLargest.add(-2));
        System.out.println(kthLargest.add(-4));
        System.out.println(kthLargest.add(0));
        System.out.println(kthLargest.add(4));
//        2],[1],[-1],[3],[4
//        -3],[-2],[-4],[0],[4
    }

    public int add(int val) {
        int index = Math.min(k, num.size());
        while (index > 0 && num.get(index - 1) < val) {
            index--;
        }
        if (index <= k && index <= num.size())
            num.add(index, val);
        return num.get(k - 1);
    }
}

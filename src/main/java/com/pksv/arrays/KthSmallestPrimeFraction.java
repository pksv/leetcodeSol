package com.pksv.arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class KthSmallestPrimeFraction {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int k = 3;
        System.out.println(Arrays.toString(new KthSmallestPrimeFraction().kthSmallestPrimeFraction(arr, k)));
    }

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        Map<Double, int[]> temp = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                double d = (double) arr[i] / arr[j];
                temp.put(d, new int[]{arr[i], arr[j]});
            }
        }
        int y = 1;
        for (var x : temp.values()) {
            if (y++ == k) return x;
        }
        return new int[2];
    }
}

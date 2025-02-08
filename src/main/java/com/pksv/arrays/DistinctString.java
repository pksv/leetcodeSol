package com.pksv.arrays;

import java.util.HashMap;
import java.util.Map;

//Kth Distinct String in an Array
public class DistinctString {
    public static void main(String[] args) {
//        String[] arr = {"d", "b", "c", "b", "c", "a"};
        String[] arr = {"a", "b", "a"};
        int k = 2;
        System.out.println(new DistinctString().kthDistinct(arr, k));
    }

    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> count = new HashMap<>();
        for (String s : arr) {
            count.put(s, count.getOrDefault(s, 0) + 1);
        }
        int j = 0;
        for (var c : arr) {
            if (count.get(c) == 1) {
                j++;
                if (j == k) return c;
            }
        }
        return "";
    }
}

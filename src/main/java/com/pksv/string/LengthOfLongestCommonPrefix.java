package com.pksv;

import java.util.HashSet;

//Find the Length of the Longest Common Prefix
public class LengthOfLongestCommonPrefix {
    public static void main(String[] args) {
//        int[] arr1 = {1, 10, 100}, arr2 = {1000};
        int[] arr1 = {1, 2, 3}, arr2 = {4, 4, 4};
        System.out.println(new LengthOfLongestCommonPrefix().longestCommonPrefix(arr1, arr2));
    }

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> prefixArr1 = new HashSet<>();
        for (var num : arr1) {
            while (num > 0) {
                prefixArr1.add(num);
                num /= 10;
            }
        }

        int largest = 0;
        for (var num : arr2) {
            while (num > 0) {
                if (prefixArr1.contains(num)) {
                    largest = Math.max(largest, num);
                    break;
                } else num /= 10;
            }
        }

        return largest == 0 ? 0 : String.valueOf(largest).length();
    }
}

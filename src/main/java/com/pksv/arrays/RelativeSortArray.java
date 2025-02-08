package com.pksv;

import java.util.Arrays;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        System.out.println(Arrays.toString(new RelativeSortArray().relativeSortArray(arr1, arr2)));
    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max = arr1[0];
        for (int k : arr1) {
            max = Math.max(max, k);
        }
        int[] freq = new int[max + 1];
        for (int n : arr1) {
            freq[n]++;
        }
        int counter = 0;
        for (int j : arr2) {
            while (freq[j]-- > 0) {
                arr1[counter++] = j;
            }
        }

        for (int i = 0; i < freq.length; i++) {
            while (freq[i]-- > 0) {
                arr1[counter++] = i;
            }
        }

        return arr1;
    }
}

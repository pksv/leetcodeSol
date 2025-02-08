package com.pksv.bit_manipulation;

import java.util.Arrays;

//XOR Queries of a SubArray
public class XORQueriesSubArray {
    public static void main(String[] args) {
//        int[] arr = {1, 3, 4, 8};
        int[] arr = {4, 8, 2, 10};
//        int[][] queries = {{0, 1}, {1, 2}, {0, 3}, {3, 3}};
        int[][] queries = {{2, 3}, {1, 3}, {0, 0}, {0, 3}};
        System.out.println(Arrays.toString(new XORQueriesSubArray().xorQueries(arr, queries)));
    }

    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] sol = new int[queries.length];
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = arr[i] ^ prefix[i - 1];
        }
        int i = 0;
        for (var q : queries) {
            int j = q[0], k = q[1];
            if (q[0] == 0) sol[i++] = prefix[k];
            else sol[i++] = prefix[k] ^ prefix[j - 1];
        }
        return sol;
    }
}

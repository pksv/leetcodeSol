package com.pksv.arrays;

import java.util.ArrayList;
import java.util.List;

public class SetOfCoins {
    public static void main(String[] args) {
        int N = 5;
        int M = 3;
        int[] Amount = {2, 4, 2, 3, 1};
        System.out.println(magicLand(Amount, M, N));
    }

    static long magicLand(int[] Amount, int M, int N) {
        // Write your code here
        List<List<Integer>> s = new ArrayList<>();
        for (int i = 0; i <= N - M; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    List<Integer> subarray = new ArrayList<>();
                    subarray.add(Amount[i]);
                    subarray.add(Amount[j]);
                    subarray.add(Amount[k]);
                    s.add(new ArrayList<>(subarray));
                }
            }
        }
        long sum = 0L;
        for (List<Integer> x : s) {
            long biggest = 0L;
            for (Integer y : x) {
                if (biggest < y) biggest = y;
            }
            sum += biggest;
        }

        return sum;
    }
}


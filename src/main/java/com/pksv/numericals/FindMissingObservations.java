package com.pksv;

import java.util.Arrays;

public class FindMissingObservations {
    public static void main(String[] args) {
        int[] rolls = {3, 2, 4, 3};
//        int[] rolls = {1, 5, 6};
//        int[] rolls = {1, 2, 3, 4};
//        int[] rolls = {6, 3, 4, 3, 5, 3};
//        int[] rolls = {4, 5, 6, 2, 3, 6, 5, 4, 6, 4, 5, 1, 6, 3, 1, 4, 5, 5, 3, 2, 3, 5, 3, 2, 1, 5, 4, 3, 5, 1, 5};
        int mean = 4, n = 2;
//        int mean = 4, n = 40;
//        int mean = 4, n = 4;
        System.out.println(Arrays.toString(new FindMissingObservations().missingRolls(rolls, mean, n)));
    }

    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int mSum = 0;
        for (int roll : rolls) {
            mSum += roll;
        }
        int nSum = mean * (m + n) - mSum;
        int avg = nSum / n;
        int r = nSum % n;
        if (nSum > 6 * n || nSum < n)
            return new int[]{};
        int[] sol = new int[n];

        for (int i = 0; i < r; i++) {
            sol[i] = avg + 1;
        }
        for (int i = r; i < n; i++) {
            sol[i] = avg;
        }
        return sol;
    }
}

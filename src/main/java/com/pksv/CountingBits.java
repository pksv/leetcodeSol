package com.pksv;

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        var x = new CountingBits().countBits(5);
        System.out.println(Arrays.toString(x));
    }

    public int[] countBits(int n) {
        int[] sol = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            var x = Integer.toString(i, 2).replaceAll("0", "");
            sol[i] = x.length();
        }
        return sol;
    }
}

package com.pksv.numericals;

import java.util.Arrays;

public class PerfectSquares {
    public static void main(String[] args) {
        System.out.println(new PerfectSquares().numSquares1(12));
    }

    public int numSquares(int n) {
        int[] x = new int[n + 1];
        Arrays.fill(x, Integer.MAX_VALUE);
        x[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                System.out.println("i = " + i + "; j = " + j + "; x[i] = " + x[i] + "; x[i - (j * j)] = " + x[i - (j * j)]);
                x[i] = Math.min(x[i], 1 + x[i - (j * j)]);
                System.out.println("x[i] = " + x[i]);
            }
        }

        return x[n];
    }

    public int numSquares1(int n) {
        if (isPerfectSquare(n)) return 1;

        for (int i = 0; i * i < n; i++) {
            if (isPerfectSquare(n - i * i)) return 2;
        }

        while (n % 4 == 0) {
            n /= 4;
        }
        if (n % 8 == 7) {
            return 4;
        }

        return 3;
    }

    private boolean isPerfectSquare(int x) {
        int a = (int) Math.sqrt(x);
        return a * a == x;
    }
}

package com.pksv;

import java.util.Arrays;

public class StrangePrinter {
    public static void main(String[] args) {
//        String s = "aaabbb";
        String s = "abcabc";
        System.out.println(new StrangePrinter().strangePrinter(s));
    }

    public int strangePrinter(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (var arr : dp) Arrays.fill(arr, -1);

        return helperMethod(0, n - 1, dp, s.toCharArray());
    }

    private int helperMethod(int i, int j, int[][] dp, char[] s) {
        if (i > j)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        var fc = s[i];
        int ans = 1 + helperMethod(i + 1, j, dp, s);
        for (int k = i + 1; k <= j; k++) {
            if (fc == s[k]) {
                int a = helperMethod(i, k - 1, dp, s) + helperMethod(k + 1, j, dp, s);
                ans = Math.min(ans, a);
            }
        }

        return dp[i][j] = ans;
    }
}

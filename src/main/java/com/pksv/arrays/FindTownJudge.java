package com.pksv.arrays;

public class FindTownJudge {
    public static void main(String[] args) {
        int[][] trust = {{1, 3}, {2, 3}};
        int n = 3;
        System.out.println(new FindTownJudge().findJudge(n, trust));
    }

    public int findJudge(int n, int[][] trust) {
        int[] t = new int[n + 1];
        for (var x : trust) {
            t[x[0]]--;
            t[x[1]]++;
        }
        for (int j = 1; j < t.length; j++) {
            if (t[j] == n - 1) return j;
        }
        return -1;
    }
}
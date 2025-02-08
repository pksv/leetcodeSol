package com.pksv.arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class RelativeRanks {
    public static void main(String[] args) {
        int[] score = {10,3,8,9,4};
        System.out.println(Arrays.toString(new RelativeRanks().findRelativeRanks(score)));
    }

    public String[] findRelativeRanks(int[] score) {
        Map<Integer, Integer> temp = new TreeMap<>();
        for (int i = 0; i < score.length; i++) {
            temp.put(score[i], i);
        }
        String[] res = new String[score.length];
        int i = res.length;
        for (int x : temp.values()) {
            String s;
            if (i == 1) s = "Gold Medal";
            else if (i == 2) s = "Silver Medal";
            else if (i == 3) s = "Bronze Medal";
            else s = i + "";
            i--;
            res[x] = s;
        }

        return res;
    }
}
